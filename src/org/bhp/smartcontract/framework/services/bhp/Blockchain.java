package org.bhp.smartcontract.framework.services.bhp;

import org.bhp.smartcontract.framework.Syscall;

public class Blockchain {
	@Syscall("Bhp.Blockchain.GetHeight")
	public native static int height();

	@Syscall("Bhp.Blockchain.GetHeader")
	public native static Header getHeader(int height);

	@Syscall("Bhp.Blockchain.GetHeader")
	public native static Header getHeader(byte[] hash);

	@Syscall("Bhp.Blockchain.GetBlock")
	public native static Block getBlock(int height);

	@Syscall("Bhp.Blockchain.GetBlock")
	public native static Block getBlock(byte[] hash);

	@Syscall("Bhp.Blockchain.GetTransaction")
	public native static Transaction getTransaction(byte[] hash);

	@Syscall("Bhp.Blockchain.GetAccount")
	public native static Account getAccount(byte[] script_hash);

	@Syscall("Bhp.Blockchain.GetValidators")
	public native static byte[][] getValidators();

	@Syscall("Bhp.Blockchain.GetAsset")
	public native static Asset getAsset(byte[] asset_id);

	@Syscall("Bhp.Blockchain.GetContract")
	public native static Contract getContract(byte[] script_hash);
}
