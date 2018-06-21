package org.bhp.smartcontract.framework.services.bhp;

import org.bhp.smartcontract.framework.Syscall;

public final class Validator {
	@Syscall("Bhp.Validator.Register")
	public native static Validator register(byte[] pubkey);
}
