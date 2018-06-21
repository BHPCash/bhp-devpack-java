package org.bhp.smartcontract.framework.services.bhp;

import org.bhp.smartcontract.framework.*;

public class TransactionInput implements ApiInterface {
	@Syscall("Bhp.Input.GetHash")
	public native byte[] prevHash();

	@Syscall("Bhp.Input.GetIndex")
	public native short prevIndex();
}
