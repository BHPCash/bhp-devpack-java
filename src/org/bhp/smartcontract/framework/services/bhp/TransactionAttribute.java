package org.bhp.smartcontract.framework.services.bhp;

import org.bhp.smartcontract.framework.*;

public class TransactionAttribute implements ApiInterface {
	@Syscall("Bhp.Attribute.GetUsage")
	public native byte usage();

	@Syscall("Bhp.Attribute.GetData")
	public native byte[] data();
}
