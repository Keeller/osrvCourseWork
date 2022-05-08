pragma solidity ^0.7.0;

contract AuditContract {
    mapping(string=>string) public hashInfo;
    string[] public keys;

    function put(string memory key, string memory value) public{
        hashInfo[key]=value;
        keys.push(key);
    }

    function get(string memory key) public view returns(string memory){
        return hashInfo[key];
    }

    function keyLength() public view returns(uint){
        return keys.length;
    }

}
