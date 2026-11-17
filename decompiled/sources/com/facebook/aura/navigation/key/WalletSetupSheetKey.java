package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.model.WalletSetupOption;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class WalletSetupSheetKey extends C06G implements AuraBottomSheetNavKey {
    public final List<WalletSetupOption> options;
    public final String sourceSessionId;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, WalletSetupSheetKey$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<WalletSetupSheetKey> serializer() {
            return WalletSetupSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public WalletSetupSheetKey(List<WalletSetupOption> list, String str) {
        C7384Etj.A0Y(list, 0);
        this.options = list;
        this.sourceSessionId = str;
    }

    public final WalletSetupSheetKey copy(List<WalletSetupOption> list, String str) {
        C7384Etj.A0Y(list, 0);
        return new WalletSetupSheetKey(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WalletSetupSheetKey) {
                WalletSetupSheetKey walletSetupSheetKey = (WalletSetupSheetKey) obj;
                if (!C7384Etj.areEqual(this.options, walletSetupSheetKey.options) || !C7384Etj.areEqual(this.sourceSessionId, walletSetupSheetKey.sourceSessionId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WalletSetupSheetKey copy$default(WalletSetupSheetKey walletSetupSheetKey, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = walletSetupSheetKey.options;
        }
        if ((i & 2) != 0) {
            str = walletSetupSheetKey.sourceSessionId;
        }
        C7384Etj.A0Y(list, 0);
        return new WalletSetupSheetKey(list, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(WalletSetupSheetKey walletSetupSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(walletSetupSheetKey.options, C06G.A0e($childSerializers, 0), c9iZ, 0);
        if (c9j5.AfR() || walletSetupSheetKey.sourceSessionId != null) {
            c9j5.AAP(walletSetupSheetKey.sourceSessionId, C07779iq.A01, c9iZ, 1);
        }
    }

    public final List<WalletSetupOption> component1() {
        return this.options;
    }

    public final String component2() {
        return this.sourceSessionId;
    }

    public final List<WalletSetupOption> getOptions() {
        return this.options;
    }

    public final String getSourceSessionId() {
        return this.sourceSessionId;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.options) + AnonymousClass006.A0G(this.sourceSessionId);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WalletSetupSheetKey(List list, String str, int i, C06H c06h) {
        this(list, AnonymousClass006.A0s(i, str));
    }

    public /* synthetic */ WalletSetupSheetKey(int i, List list, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(WalletSetupSheetKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.options = list;
        this.sourceSessionId = (i & 2) == 0 ? null : str;
    }
}
