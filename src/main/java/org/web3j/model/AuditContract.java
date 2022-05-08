package org.web3j.model;

import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
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
public class AuditContract extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b50610714806100206000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c80630cb6aaf11461005c578063425080c8146100ee578063693ec85e146102195780638258e70a146102bd578063f7de87ae14610361575b600080fd5b6100796004803603602081101561007257600080fd5b503561037b565b6040805160208082528351818301528351919283929083019185019080838360005b838110156100b357818101518382015260200161009b565b50505050905090810190601f1680156100e05780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6102176004803603604081101561010457600080fd5b810190602081018135600160201b81111561011e57600080fd5b82018360208201111561013057600080fd5b803590602001918460018302840111600160201b8311171561015157600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b8111156101a357600080fd5b8201836020820111156101b557600080fd5b803590602001918460018302840111600160201b831117156101d657600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929550610421945050505050565b005b6100796004803603602081101561022f57600080fd5b810190602081018135600160201b81111561024957600080fd5b82018360208201111561025b57600080fd5b803590602001918460018302840111600160201b8311171561027c57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295506104dd945050505050565b610079600480360360208110156102d357600080fd5b810190602081018135600160201b8111156102ed57600080fd5b8201836020820111156102ff57600080fd5b803590602001918460018302840111600160201b8311171561032057600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295506105d1945050505050565b610369610645565b60408051918252519081900360200190f35b6001818154811061038857fe5b600091825260209182902001805460408051601f60026000196101006001871615020190941693909304928301859004850281018501909152818152935090918301828280156104195780601f106103ee57610100808354040283529160200191610419565b820191906000526020600020905b8154815290600101906020018083116103fc57829003601f168201915b505050505081565b806000836040518082805190602001908083835b602083106104545780518252601f199092019160209182019101610435565b51815160209384036101000a60001901801990921691161790529201948552506040519384900381019093208451610495959194919091019250905061064b565b5060018054808201825560009190915282516104d8917fb10e2d527612073b26eecdfd717e6a320cf44b4afac2b0732d9fcbe2b7fa0cf60190602085019061064b565b505050565b60606000826040518082805190602001908083835b602083106105115780518252601f1990920191602091820191016104f2565b518151600019602094850361010090810a820192831692199390931691909117909252949092019687526040805197889003820188208054601f60026001831615909802909501169590950492830182900482028801820190528187529294509250508301828280156105c55780601f1061059a576101008083540402835291602001916105c5565b820191906000526020600020905b8154815290600101906020018083116105a857829003601f168201915b50505050509050919050565b805160208183018101805160008252928201938201939093209190925280546040805160026001841615610100026000190190931692909204601f810185900485028301850190915280825290928301828280156104195780601f106103ee57610100808354040283529160200191610419565b60015490565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061068c57805160ff19168380011785556106b9565b828001600101855582156106b9579182015b828111156106b957825182559160200191906001019061069e565b506106c59291506106c9565b5090565b5b808211156106c557600081556001016106ca56fea26469706673582212200be1a19f15861273a7197b1c5af05d5ca6adcd576ba0d739f8709ecd3805fcf164736f6c63430007010033";

    public static final String FUNC_GET = "get";

    public static final String FUNC_HASHINFO = "hashInfo";

    public static final String FUNC_KEYLENGTH = "keyLength";

    public static final String FUNC_KEYS = "keys";

    public static final String FUNC_PUT = "put";

    @Deprecated
    protected AuditContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected AuditContract(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected AuditContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected AuditContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    @Deprecated
    public static AuditContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new AuditContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static AuditContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new AuditContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static AuditContract load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new AuditContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static AuditContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new AuditContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<AuditContract> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(AuditContract.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<AuditContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(AuditContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<AuditContract> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(AuditContract.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<AuditContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(AuditContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public RemoteFunctionCall<String> get(String key) {
        final Function function = new Function(FUNC_GET,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(key)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {
                }));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> hashInfo(String param0) {
        final Function function = new Function(FUNC_HASHINFO,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(param0)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {
                }));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> keyLength() {
        final Function function = new Function(FUNC_KEYLENGTH,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {
                }));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> keys(BigInteger param0) {
        final Function function = new Function(FUNC_KEYS,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {
                }));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> put(String key, String value) {
        final Function function = new Function(
                FUNC_PUT,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(key),
                        new org.web3j.abi.datatypes.Utf8String(value)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }
}
