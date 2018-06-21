package org.bhp.smartcontract.framework.services.bhp;

import org.bhp.smartcontract.framework.*;

public class TransactionOutput implements ApiInterface {
	@Syscall("Bhp.Output.GetAssetId")
	public native byte[] assetId();

	@Syscall("Bhp.Output.GetValue")
	public native long value();

	@Syscall("Bhp.Output.GetScriptHash")
	public native byte[] scriptHash();
}
