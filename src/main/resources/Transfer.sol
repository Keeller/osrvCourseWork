pragma solidity ^0.7.0;

abstract contract Transfer {
    string company;
    bool public isFailed = false;
    string public owner;
    mapping(string => int64) public sensors;


    function CheckIsFailed() public virtual returns (bool);

    function put(string memory key, int64 value) public {
        sensors[key] = value;
    }

    function setOwner(string memory newOwner) public {
        owner = newOwner;
    }
}

contract PictureTransfer is Transfer {

    function CheckIsFailed() public override(Transfer) returns (bool){
        if (!isFailed) {
            isFailed = !(((sensors["temperatureValue1"] < 30 && sensors["temperatureValue1"] > 10) ||
            (sensors["temperatureValue2"] < 30 && sensors["temperatureValue2"] > 10)) &&
            ((sensors["humidityValue1"] < 12 && sensors["humidityValue1"] > 10) ||
            (sensors["humidityValue2"] < 15 && sensors["humidityValue2"] > 11)));
            return isFailed;
        }
        return true;
    }
}