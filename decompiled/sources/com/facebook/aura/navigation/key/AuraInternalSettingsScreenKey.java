package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class AuraInternalSettingsScreenKey extends C06G implements AuraFullScreenNavKey {
    public final InternalSettingsPage page;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, AuraInternalSettingsScreenKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<AuraInternalSettingsScreenKey> serializer() {
            return AuraInternalSettingsScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final AuraInternalSettingsScreenKey copy(InternalSettingsPage internalSettingsPage) {
        C7384Etj.A0Y(internalSettingsPage, 0);
        return new AuraInternalSettingsScreenKey(internalSettingsPage);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AuraInternalSettingsScreenKey) && this.page == ((AuraInternalSettingsScreenKey) obj).page);
    }

    public static /* synthetic */ AuraInternalSettingsScreenKey copy$default(AuraInternalSettingsScreenKey auraInternalSettingsScreenKey, InternalSettingsPage internalSettingsPage, int i, Object obj) {
        if ((i & 1) != 0) {
            internalSettingsPage = auraInternalSettingsScreenKey.page;
        }
        C7384Etj.A0Y(internalSettingsPage, 0);
        return new AuraInternalSettingsScreenKey(internalSettingsPage);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(AuraInternalSettingsScreenKey auraInternalSettingsScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || auraInternalSettingsScreenKey.page != InternalSettingsPage.MAIN) {
            c9j5.AAQ(auraInternalSettingsScreenKey.page, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final InternalSettingsPage component1() {
        return this.page;
    }

    public final InternalSettingsPage getPage() {
        return this.page;
    }

    public int hashCode() {
        return this.page.hashCode();
    }

    public /* synthetic */ AuraInternalSettingsScreenKey(int i, InternalSettingsPage internalSettingsPage, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.page = InternalSettingsPage.MAIN;
        } else {
            this.page = internalSettingsPage;
        }
    }

    public String toString() {
        return super.toString();
    }

    public AuraInternalSettingsScreenKey(InternalSettingsPage internalSettingsPage) {
        C7384Etj.A0Y(internalSettingsPage, 0);
        this.page = internalSettingsPage;
    }

    public /* synthetic */ AuraInternalSettingsScreenKey(InternalSettingsPage internalSettingsPage, int i, C06H c06h) {
        this((i & 1) != 0 ? InternalSettingsPage.MAIN : internalSettingsPage);
    }

    public AuraInternalSettingsScreenKey() {
        this(InternalSettingsPage.MAIN);
    }
}
