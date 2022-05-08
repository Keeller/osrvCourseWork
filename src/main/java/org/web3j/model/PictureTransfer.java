package org.web3j.model;

import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Int64;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.8.7.
 */
@SuppressWarnings("rawtypes")
public class PictureTransfer extends Contract {
    public static final String BINARY = "60806040526001805460ff1916905534801561001a57600080fd5b506107568061002a6000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c806302a1a6cc146100675780630b8076ec146100835780637067b14f1461012b578063887a5042146101d65780638da5cb5b14610293578063f416334014610310575b600080fd5b61006f610318565b604080519115158252519081900360200190f35b6101296004803603602081101561009957600080fd5b8101906020810181356401000000008111156100b457600080fd5b8201836020820111156100c657600080fd5b803590602001918460018302840111640100000000831117156100e857600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929550610537945050505050565b005b6101296004803603604081101561014157600080fd5b81019060208101813564010000000081111561015c57600080fd5b82018360208201111561016e57600080fd5b8035906020019184600183028401116401000000008311171561019057600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295505050903560070b915061054e9050565b61027c600480360360208110156101ec57600080fd5b81019060208101813564010000000081111561020757600080fd5b82018360208201111561021957600080fd5b8035906020019184600183028401116401000000008311171561023b57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295506105d9945050505050565b6040805160079290920b8252519081900360200190f35b61029b6105f9565b6040805160208082528351818301528351919283929083019185019080838360005b838110156102d55781810151838201526020016102bd565b50505050905090810190601f1680156103025780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b61006f610684565b60015460009060ff1661053057604080517074656d706572617475726556616c75653160781b815260036011820152905190819003603101902054601e600791820b90910b12801561039f5750604080517074656d706572617475726556616c75653160781b815260036011820152905190819003603101902054600a600791820b90910b135b8061041f575060408051703a32b6b832b930ba3ab932ab30b63ab29960791b815260036011820152905190819003603101902054601e600791820b90910b12801561041f575060408051703a32b6b832b930ba3ab932ab30b63ab29960791b815260036011820152905190819003603101902054600a600791820b90910b135b80156105145750604080516d68756d696469747956616c75653160901b81526003600e820152905190819003602e01902054600c600791820b90910b12801561049a5750604080516d68756d696469747956616c75653160901b81526003600e820152905190819003602e01902054600a600791820b90910b135b806105145750604080516d343ab6b4b234ba3cab30b63ab29960911b81526003600e820152905190819003602e01902054600f600791820b90910b1280156105145750604080516d343ab6b4b234ba3cab30b63ab29960911b81526003600e820152905190819003602e01902054600b600791820b90910b135b6001805460ff19169115919091179081905560ff169050610534565b5060015b90565b805161054a90600290602084019061068d565b5050565b806003836040518082805190602001908083835b602083106105815780518252601f199092019160209182019101610562565b51815160209384036101000a60001901801990921691161790529201948552506040519384900301909220805467ffffffffffffffff191667ffffffffffffffff60079590950b949094169390931790925550505050565b805160208183018101805160038252928201919093012091525460070b81565b6002805460408051602060018416156101000260001901909316849004601f8101849004840282018401909252818152929183018282801561067c5780601f106106515761010080835404028352916020019161067c565b820191906000526020600020905b81548152906001019060200180831161065f57829003601f168201915b505050505081565b60015460ff1681565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106106ce57805160ff19168380011785556106fb565b828001600101855582156106fb579182015b828111156106fb5782518255916020019190600101906106e0565b5061070792915061070b565b5090565b5b80821115610707576000815560010161070c56fea26469706673582212200f4d7120b09327592b27263cdc52e20e9bf03603e054973301bb476ff2861e2664736f6c63430007010033";

    public static final String FUNC_CHECKISFAILED = "CheckIsFailed";

    public static final String FUNC_ISFAILED = "isFailed";

    public static final String FUNC_OWNER = "owner";

    public static final String FUNC_PUT = "put";

    public static final String FUNC_SENSORS = "sensors";

    public static final String FUNC_SETOWNER = "setOwner";

    @Deprecated
    protected PictureTransfer(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected PictureTransfer(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected PictureTransfer(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected PictureTransfer(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    @Deprecated
    public static PictureTransfer load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new PictureTransfer(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static PictureTransfer load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new PictureTransfer(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static PictureTransfer load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new PictureTransfer(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static PictureTransfer load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new PictureTransfer(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<PictureTransfer> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(PictureTransfer.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<PictureTransfer> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(PictureTransfer.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<PictureTransfer> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(PictureTransfer.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<PictureTransfer> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(PictureTransfer.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public RemoteFunctionCall<TransactionReceipt> CheckIsFailed() {
        final Function function = new Function(
                FUNC_CHECKISFAILED,
                Arrays.<Type>asList(),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> isFailed() {
        final Function function = new Function(FUNC_ISFAILED,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {
                }));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<String> owner() {
        final Function function = new Function(FUNC_OWNER,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {
                }));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> put(String key, BigInteger value) {
        final Function function = new Function(
                FUNC_PUT,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(key),
                        new org.web3j.abi.datatypes.generated.Int64(value)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> sensors(String param0) {
        final Function function = new Function(FUNC_SENSORS,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(param0)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Int64>() {
                }));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> setOwner(String newOwner) {
        final Function function = new Function(
                FUNC_SETOWNER,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(newOwner)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }
}
