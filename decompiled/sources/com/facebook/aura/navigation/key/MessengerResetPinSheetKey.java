package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class MessengerResetPinSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String iconUrl;
    public final HatchSkillOAuthOrigin origin;
    public final MessengerPinLockoutReason reason;

    public final class Companion {
        public final C9hr<MessengerResetPinSheetKey> serializer() {
            return MessengerResetPinSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1V(num, null, AbstractC5321DgF.A02(num, MessengerResetPinSheetKey$Companion$$childSerializers$1.INSTANCE), MessengerResetPinSheetKey$Companion$$childSerializers$2.INSTANCE);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MessengerResetPinSheetKey) {
                MessengerResetPinSheetKey messengerResetPinSheetKey = (MessengerResetPinSheetKey) obj;
                if (!C7384Etj.areEqual(this.iconUrl, messengerResetPinSheetKey.iconUrl) || this.reason != messengerResetPinSheetKey.reason || this.origin != messengerResetPinSheetKey.origin) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MessengerResetPinSheetKey copy$default(MessengerResetPinSheetKey messengerResetPinSheetKey, String str, MessengerPinLockoutReason messengerPinLockoutReason, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messengerResetPinSheetKey.iconUrl;
        }
        if ((i & 2) != 0) {
            messengerPinLockoutReason = messengerResetPinSheetKey.reason;
        }
        if ((i & 4) != 0) {
            hatchSkillOAuthOrigin = messengerResetPinSheetKey.origin;
        }
        return messengerResetPinSheetKey.copy(str, messengerPinLockoutReason, hatchSkillOAuthOrigin);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(MessengerResetPinSheetKey messengerResetPinSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || messengerResetPinSheetKey.iconUrl != null) {
            c9j5.AAP(messengerResetPinSheetKey.iconUrl, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || messengerResetPinSheetKey.reason != MessengerPinLockoutReason.TOO_MANY_ATTEMPTS) {
            c9j5.AAQ(messengerResetPinSheetKey.reason, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || messengerResetPinSheetKey.origin != HatchSkillOAuthOrigin.BOT_SHEET) {
            c9j5.AAQ(messengerResetPinSheetKey.origin, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.iconUrl;
    }

    public final MessengerPinLockoutReason component2() {
        return this.reason;
    }

    public final HatchSkillOAuthOrigin component3() {
        return this.origin;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final HatchSkillOAuthOrigin getOrigin() {
        return this.origin;
    }

    public final MessengerPinLockoutReason getReason() {
        return this.reason;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.origin, AnonymousClass005.A0F(this.reason, AnonymousClass006.A0G(this.iconUrl) * 31));
    }

    public MessengerResetPinSheetKey(String str, MessengerPinLockoutReason messengerPinLockoutReason, HatchSkillOAuthOrigin hatchSkillOAuthOrigin) {
        AnonymousClass003.A0x(messengerPinLockoutReason, hatchSkillOAuthOrigin);
        this.iconUrl = str;
        this.reason = messengerPinLockoutReason;
        this.origin = hatchSkillOAuthOrigin;
    }

    public final MessengerResetPinSheetKey copy(String str, MessengerPinLockoutReason messengerPinLockoutReason, HatchSkillOAuthOrigin hatchSkillOAuthOrigin) {
        AnonymousClass003.A0x(messengerPinLockoutReason, hatchSkillOAuthOrigin);
        return new MessengerResetPinSheetKey(str, messengerPinLockoutReason, hatchSkillOAuthOrigin);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MessengerResetPinSheetKey(int i, String str, MessengerPinLockoutReason messengerPinLockoutReason, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, C2hx c2hx) {
        this.iconUrl = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.reason = MessengerPinLockoutReason.TOO_MANY_ATTEMPTS;
        } else {
            this.reason = messengerPinLockoutReason;
        }
        if ((i & 4) == 0) {
            this.origin = HatchSkillOAuthOrigin.BOT_SHEET;
        } else {
            this.origin = hatchSkillOAuthOrigin;
        }
    }

    public /* synthetic */ MessengerResetPinSheetKey(String str, MessengerPinLockoutReason messengerPinLockoutReason, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str), (i & 2) != 0 ? MessengerPinLockoutReason.TOO_MANY_ATTEMPTS : messengerPinLockoutReason, (i & 4) != 0 ? HatchSkillOAuthOrigin.BOT_SHEET : hatchSkillOAuthOrigin);
    }

    public MessengerResetPinSheetKey() {
        this(null, MessengerPinLockoutReason.TOO_MANY_ATTEMPTS, HatchSkillOAuthOrigin.BOT_SHEET);
    }
}
