package com.facebook.aura.wallet.address;

import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class HatchWalletAccountInfoResponseJson extends C06G {
    public final List<HatchWalletSavedAddressJson> addresses;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, HatchWalletAccountInfoResponseJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<HatchWalletAccountInfoResponseJson> serializer() {
            return HatchWalletAccountInfoResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final HatchWalletAccountInfoResponseJson copy(List<HatchWalletSavedAddressJson> list) {
        C7384Etj.A0Y(list, 0);
        return new HatchWalletAccountInfoResponseJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchWalletAccountInfoResponseJson) && C7384Etj.areEqual(this.addresses, ((HatchWalletAccountInfoResponseJson) obj).addresses));
    }

    public static /* synthetic */ HatchWalletAccountInfoResponseJson copy$default(HatchWalletAccountInfoResponseJson hatchWalletAccountInfoResponseJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hatchWalletAccountInfoResponseJson.addresses;
        }
        C7384Etj.A0Y(list, 0);
        return new HatchWalletAccountInfoResponseJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_wallet_address_address(HatchWalletAccountInfoResponseJson hatchWalletAccountInfoResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C3cG.A1L(hatchWalletAccountInfoResponseJson.addresses)) {
            c9j5.AAQ(hatchWalletAccountInfoResponseJson.addresses, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<HatchWalletSavedAddressJson> component1() {
        return this.addresses;
    }

    public final List<HatchWalletSavedAddressJson> getAddresses() {
        return this.addresses;
    }

    public int hashCode() {
        return this.addresses.hashCode();
    }

    public /* synthetic */ HatchWalletAccountInfoResponseJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.addresses = C0881AGi.A00;
        } else {
            this.addresses = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public HatchWalletAccountInfoResponseJson(List<HatchWalletSavedAddressJson> list) {
        C7384Etj.A0Y(list, 0);
        this.addresses = list;
    }

    public /* synthetic */ HatchWalletAccountInfoResponseJson(List list, int i, C06H c06h) {
        this(C3cI.A10(list, i));
    }

    public HatchWalletAccountInfoResponseJson() {
        this(C0881AGi.A00);
    }
}
