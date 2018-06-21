package org.bhp.smartcontract.framework.services.bhp;

import org.bhp.smartcontract.framework.Syscall;

public class Asset {
	@Syscall("Bhp.Asset.GetAssetId")
	public native byte[] assetId();

	@Syscall("Bhp.Asset.GetAssetType")
	public native byte assetType();

	@Syscall("Bhp.Asset.GetAmount")
	public native long amount();

	@Syscall("Bhp.Asset.GetAvailable")
	public native long available();

	@Syscall("Bhp.Asset.GetPrecision")
	public native byte precision();

	@Syscall("Bhp.Asset.GetOwner")
	public native byte[] owner();

	@Syscall("Bhp.Asset.GetAdmin")
	public native byte[] admin();

	@Syscall("Bhp.Asset.GetIssuer")
	public native byte[] issuer();

	@Syscall("Bhp.Asset.Create")
	public native static Asset create(byte asset_type, String name, long amount, byte precision, byte[] owner,
			byte[] admin, byte[] issuer);

	@Syscall("Bhp.Asset.Renew")
	public native int renew(byte years);
}
