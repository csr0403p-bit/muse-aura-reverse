package com.facebook.rsys.metaaivoicestate.gen;

import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class DeepDiveSnapshot {
    public static G50<DeepDiveSnapshot> CONVERTER = C8921Ftd.A00(24);
    public static long sMcfTypeId;
    public final String snapshotId;
    public final ArrayList<DeepDiveTopic> topics;

    public static native DeepDiveSnapshot createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeepDiveSnapshot) {
                DeepDiveSnapshot deepDiveSnapshot = (DeepDiveSnapshot) obj;
                if (!this.snapshotId.equals(deepDiveSnapshot.snapshotId) || !this.topics.equals(deepDiveSnapshot.topics)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.topics, BV8.A0B(this.snapshotId));
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DeepDiveSnapshot{snapshotId=");
        sbA0x.append(this.snapshotId);
        sbA0x.append(",topics=");
        return BV8.A0v(this.topics, sbA0x);
    }

    public DeepDiveSnapshot(String str, ArrayList<DeepDiveTopic> arrayList) {
        str.getClass();
        arrayList.getClass();
        this.snapshotId = str;
        this.topics = arrayList;
    }
}
