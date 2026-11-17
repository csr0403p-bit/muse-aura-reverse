package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchTwoFactorMethod extends C06G {
    public final Integer codeLength;
    public final String displayContactPoint;
    public final String id;
    public final String label;
    public final HatchTwoFactorMethodType type;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTwoFactorMethod) {
                HatchTwoFactorMethod hatchTwoFactorMethod = (HatchTwoFactorMethod) obj;
                if (!C7384Etj.areEqual(this.id, hatchTwoFactorMethod.id) || this.type != hatchTwoFactorMethod.type || !C7384Etj.areEqual(this.label, hatchTwoFactorMethod.label) || !C7384Etj.areEqual(this.displayContactPoint, hatchTwoFactorMethod.displayContactPoint) || !C7384Etj.areEqual(this.codeLength, hatchTwoFactorMethod.codeLength)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchTwoFactorMethod copy$default(HatchTwoFactorMethod hatchTwoFactorMethod, String str, HatchTwoFactorMethodType hatchTwoFactorMethodType, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchTwoFactorMethod.id;
        }
        if ((i & 2) != 0) {
            hatchTwoFactorMethodType = hatchTwoFactorMethod.type;
        }
        if ((i & 4) != 0) {
            str2 = hatchTwoFactorMethod.label;
        }
        if ((i & 8) != 0) {
            str3 = hatchTwoFactorMethod.displayContactPoint;
        }
        if ((i & 16) != 0) {
            num = hatchTwoFactorMethod.codeLength;
        }
        return hatchTwoFactorMethod.copy(str, hatchTwoFactorMethodType, str2, str3, num);
    }

    public final String component1() {
        return this.id;
    }

    public final HatchTwoFactorMethodType component2() {
        return this.type;
    }

    public final String component3() {
        return this.label;
    }

    public final String component4() {
        return this.displayContactPoint;
    }

    public final Integer component5() {
        return this.codeLength;
    }

    public final Integer getCodeLength() {
        return this.codeLength;
    }

    public final String getDisplayContactPoint() {
        return this.displayContactPoint;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final HatchTwoFactorMethodType getType() {
        return this.type;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.label, AnonymousClass005.A0F(this.type, AnonymousClass001.A0G(this.id))) + AnonymousClass006.A0G(this.displayContactPoint)) * 31) + C06G.A04(this.codeLength);
    }

    public HatchTwoFactorMethod(String str, HatchTwoFactorMethodType hatchTwoFactorMethodType, String str2, String str3, Integer num) {
        AnonymousClass005.A0x(str, hatchTwoFactorMethodType, str2);
        this.id = str;
        this.type = hatchTwoFactorMethodType;
        this.label = str2;
        this.displayContactPoint = str3;
        this.codeLength = num;
    }

    public final HatchTwoFactorMethod copy(String str, HatchTwoFactorMethodType hatchTwoFactorMethodType, String str2, String str3, Integer num) {
        AnonymousClass005.A0x(str, hatchTwoFactorMethodType, str2);
        return new HatchTwoFactorMethod(str, hatchTwoFactorMethodType, str2, str3, num);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchTwoFactorMethod(String str, HatchTwoFactorMethodType hatchTwoFactorMethodType, String str2, String str3, Integer num, int i, C06H c06h) {
        this(str, hatchTwoFactorMethodType, str2, AnonymousClass006.A0u(i, str3), num);
    }
}
