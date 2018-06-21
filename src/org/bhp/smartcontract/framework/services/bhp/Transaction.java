package org.bhp.smartcontract.framework.services.bhp;

import org.bhp.smartcontract.framework.*;

public class Transaction implements ScriptContainer {
	@Syscall("Bhp.Transaction.GetHash")
	public native byte[] hash();

	@Syscall("Bhp.Transaction.GetType")
	public native byte type();

	@Syscall("Bhp.Transaction.GetAttributes")
	public native TransactionAttribute[] attributes();

	@Syscall("Bhp.Transaction.GetInputs")
	public native TransactionInput[] inputs();

	@Syscall("Bhp.Transaction.GetOutputs")
	public native TransactionOutput[] outputs();

	@Syscall("Bhp.Transaction.GetReferences")
	public native TransactionOutput[] references();
}
