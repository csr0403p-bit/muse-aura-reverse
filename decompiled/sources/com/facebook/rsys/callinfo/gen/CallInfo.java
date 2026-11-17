package com.facebook.rsys.callinfo.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class CallInfo {
    public static G50<CallInfo> CONVERTER = C8926Fti.A00(17);
    public static long sMcfTypeId;
    public final int expansionBehavior;
    public final boolean isAdminAddOnly;
    public final String name;
    public final int state;
    public final ArrayList<Long> threadAdminIds;
    public final String threadPhotoURL;

    public static native CallInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallInfo) {
                CallInfo callInfo = (CallInfo) obj;
                if (this.state == callInfo.state) {
                    String str = this.name;
                    String str2 = callInfo.name;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        if (this.expansionBehavior == callInfo.expansionBehavior) {
                            ArrayList<Long> arrayList = this.threadAdminIds;
                            ArrayList<Long> arrayList2 = callInfo.threadAdminIds;
                            if (arrayList == null) {
                                if (arrayList2 != null) {
                                    return false;
                                }
                            } else if (arrayList.equals(arrayList2)) {
                            }
                            if (this.isAdminAddOnly == callInfo.isAdminAddOnly) {
                                String str3 = this.threadPhotoURL;
                                String str4 = callInfo.threadPhotoURL;
                                if (str3 == null) {
                                    if (str4 != null) {
                                        return false;
                                    }
                                } else if (str3.equals(str4)) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((527 + this.state) * 31) + AnonymousClass006.A0G(this.name)) * 31) + this.expansionBehavior) * 31) + AnonymousClass006.A0D(this.threadAdminIds)) * 31) + (this.isAdminAddOnly ? 1 : 0)) * 31) + AnonymousClass005.A0H(this.threadPhotoURL);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("CallInfo{state=");
        sbA0x.append(this.state);
        sbA0x.append(",name=");
        sbA0x.append(this.name);
        sbA0x.append(",expansionBehavior=");
        sbA0x.append(this.expansionBehavior);
        sbA0x.append(",threadAdminIds=");
        sbA0x.append(this.threadAdminIds);
        sbA0x.append(",isAdminAddOnly=");
        sbA0x.append(this.isAdminAddOnly);
        sbA0x.append(",threadPhotoURL=");
        return AbstractC7610F5x.A0w(this.threadPhotoURL, sbA0x);
    }

    public CallInfo(int i, String str, int i2, ArrayList<Long> arrayList, boolean z, String str2) {
        this.state = i;
        this.name = str;
        this.expansionBehavior = i2;
        this.threadAdminIds = arrayList;
        this.isAdminAddOnly = z;
        this.threadPhotoURL = str2;
    }
}
