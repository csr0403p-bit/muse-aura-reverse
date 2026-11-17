package com.facebook.secure.fileprovider.common;

import X.BV7;
import X.C60O;

/* loaded from: classes5.dex */
public class StatInfo {
    public long device;
    public long inode;
    public int ownerGid;
    public int ownerUid;

    public static StatInfo newInstance(int i, int i2, long j, long j2) {
        return new StatInfo(i, i2, j, j2);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("Stat{ownerUid=");
        sbA0x.append(this.ownerUid);
        sbA0x.append(",ownerGid=");
        sbA0x.append(this.ownerGid);
        sbA0x.append(",inode=");
        sbA0x.append(this.inode);
        sbA0x.append(",device=");
        sbA0x.append(this.device);
        return BV7.A11(sbA0x);
    }

    public StatInfo(int i, int i2, long j, long j2) {
        this.ownerUid = i;
        this.ownerGid = i2;
        this.inode = j;
        this.device = j2;
    }
}
