package org.bhp.smartcontract.framework.services.bhp;

import org.bhp.smartcontract.framework.Syscall;

public class Account {
	@Syscall("Bhp.Account.GetScriptHash")
	public native byte[] scriptHash();

	@Syscall("Bhp.Account.GetVotes")
	public native byte[][] getVotes();

	@Syscall("Bhp.Account.SetVotes")
	public native void setVotes(byte[][] votes);

	@Syscall("Bhp.Account.GetBalance")
	public native long getBalance(byte[] asset_id);
}
