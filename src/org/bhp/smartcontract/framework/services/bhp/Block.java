package org.bhp.smartcontract.framework.services.bhp;

import org.bhp.smartcontract.framework.Syscall;

public class Block extends Header {
	@Syscall("Bhp.Block.GetTransactionCount")
	public native int transactionCount();

	@Syscall("Bhp.Block.GetTransactions")
	public native Transaction[] transactions();

	@Syscall("Bhp.Block.GetTransaction")
	public native Transaction getTransaction(int index);
}
