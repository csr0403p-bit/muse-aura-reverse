package com.facebook.aura.navigation.key;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class RedeemInviteCodeScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String initialCode;

    public final class Companion {
        public final C9hr<RedeemInviteCodeScreenKey> serializer() {
            return RedeemInviteCodeScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(RedeemInviteCodeScreenKey redeemInviteCodeScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || redeemInviteCodeScreenKey.initialCode != null) {
            c9j5.AAP(redeemInviteCodeScreenKey.initialCode, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RedeemInviteCodeScreenKey) && C7384Etj.areEqual(this.initialCode, ((RedeemInviteCodeScreenKey) obj).initialCode));
    }

    public static /* synthetic */ RedeemInviteCodeScreenKey copy$default(RedeemInviteCodeScreenKey redeemInviteCodeScreenKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = redeemInviteCodeScreenKey.initialCode;
        }
        return new RedeemInviteCodeScreenKey(str);
    }

    public final String component1() {
        return this.initialCode;
    }

    public final RedeemInviteCodeScreenKey copy(String str) {
        return new RedeemInviteCodeScreenKey(str);
    }

    public final String getInitialCode() {
        return this.initialCode;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.initialCode);
    }

    public /* synthetic */ RedeemInviteCodeScreenKey(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.initialCode = null;
        } else {
            this.initialCode = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public RedeemInviteCodeScreenKey(String str) {
        this.initialCode = str;
    }

    public /* synthetic */ RedeemInviteCodeScreenKey(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public RedeemInviteCodeScreenKey() {
        this(null);
    }
}
