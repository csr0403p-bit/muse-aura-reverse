package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C3cI;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchPasskeyDescriptor extends C06G {
    public final String id;
    public final List<String> transports;
    public final String type;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchPasskeyDescriptor) {
                HatchPasskeyDescriptor hatchPasskeyDescriptor = (HatchPasskeyDescriptor) obj;
                if (!C7384Etj.areEqual(this.id, hatchPasskeyDescriptor.id) || !C7384Etj.areEqual(this.type, hatchPasskeyDescriptor.type) || !C7384Etj.areEqual(this.transports, hatchPasskeyDescriptor.transports)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchPasskeyDescriptor copy$default(HatchPasskeyDescriptor hatchPasskeyDescriptor, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchPasskeyDescriptor.id;
        }
        if ((i & 2) != 0) {
            str2 = hatchPasskeyDescriptor.type;
        }
        if ((i & 4) != 0) {
            list = hatchPasskeyDescriptor.transports;
        }
        return hatchPasskeyDescriptor.copy(str, str2, list);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.type;
    }

    public final List<String> component3() {
        return this.transports;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getTransports() {
        return this.transports;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.transports, AnonymousClass005.A0I(this.type, AnonymousClass001.A0G(this.id)));
    }

    public HatchPasskeyDescriptor(String str, String str2, List<String> list) {
        AnonymousClass005.A0x(str, str2, list);
        this.id = str;
        this.type = str2;
        this.transports = list;
    }

    public final HatchPasskeyDescriptor copy(String str, String str2, List<String> list) {
        AnonymousClass005.A0x(str, str2, list);
        return new HatchPasskeyDescriptor(str, str2, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchPasskeyDescriptor(String str, String str2, List list, int i, C06H c06h) {
        this(str, str2, C3cI.A12(list, i));
    }
}
