package com.facebook.aura.localbrowser.core;

import X.AbstractC7607F5u;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import X.C0KA;
import X.C3cI;
import X.C7384Etj;
import X.C8j5;

/* loaded from: classes6.dex */
public final class BrowserArg {
    public static final int $stable = 0;
    public final String description;
    public final String name;
    public final boolean required;
    public final BrowserArgType type;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserArg) {
                BrowserArg browserArg = (BrowserArg) obj;
                if (!C7384Etj.areEqual(this.name, browserArg.name) || this.type != browserArg.type || !C7384Etj.areEqual(this.description, browserArg.description) || this.required != browserArg.required) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BrowserArg copy$default(BrowserArg browserArg, String str, BrowserArgType browserArgType, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browserArg.name;
        }
        if ((i & 2) != 0) {
            browserArgType = browserArg.type;
        }
        if ((i & 4) != 0) {
            str2 = browserArg.description;
        }
        if ((i & 8) != 0) {
            z = browserArg.required;
        }
        AnonymousClass005.A0x(str, browserArgType, str2);
        return AbstractC7607F5u.A0w(str, browserArgType, str2, z);
    }

    public final String component1() {
        return this.name;
    }

    public final BrowserArgType component2() {
        return this.type;
    }

    public final String component3() {
        return this.description;
    }

    public final boolean component4() {
        return this.required;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final BrowserArgType getType() {
        return this.type;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.description, AnonymousClass005.A0F(this.type, AnonymousClass001.A0G(this.name))), this.required);
    }

    public String toString() {
        String str = this.name;
        BrowserArgType browserArgType = this.type;
        String str2 = this.description;
        boolean z = this.required;
        StringBuilder sbA0x = C3cI.A0x("BrowserArg(name=", str);
        sbA0x.append(", type=");
        sbA0x.append(browserArgType);
        sbA0x.append(", description=");
        sbA0x.append(str2);
        return C8j5.A0W(", required=", sbA0x, z);
    }

    public BrowserArg(String str, BrowserArgType browserArgType, String str2, boolean z) {
        AnonymousClass005.A0x(str, browserArgType, str2);
        this.name = str;
        this.type = browserArgType;
        this.description = str2;
        this.required = z;
    }

    public final BrowserArg copy(String str, BrowserArgType browserArgType, String str2, boolean z) {
        AnonymousClass005.A0x(str, browserArgType, str2);
        return AbstractC7607F5u.A0w(str, browserArgType, str2, z);
    }

    public /* synthetic */ BrowserArg(String str, BrowserArgType browserArgType, String str2, boolean z, int i, C06H c06h) {
        this(str, browserArgType, str2, (i & 8) != 0 ? false : z);
    }
}
