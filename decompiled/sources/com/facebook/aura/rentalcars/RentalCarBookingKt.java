package com.facebook.aura.rentalcars;

import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.BFM;
import X.C60Q;
import X.C7384Etj;
import X.G0U;
import android.text.BidiFormatter;
import com.facebook.aura.R;
import com.facebook.aura.conversation.viewmodel.ConversationSourceChatReturnKt;
import com.facebook.aura.conversation.viewmodel.HatchConversationComposerController;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import java.time.LocalDate;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class RentalCarBookingKt {

    /* renamed from: com.facebook.aura.rentalcars.RentalCarBookingKt$sendRentalCarBookingMessage$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<String, Boolean> {
        public final /* synthetic */ String $message;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        @Override // X.G0U
        public final Boolean invoke(String str) {
            C7384Etj.A0Y(str, 0);
            return Boolean.valueOf(HatchConversationComposerController.Companion.getInstance(this.$userSession).requestSend(str, this.$message));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz, String str) {
            super(1);
            this.$userSession = abstractC3358CGz;
            this.$message = str;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarBookingKt$sendRentalCarBookingMessage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public final /* synthetic */ RentalCarDetailsScreenKey $key;

        /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
        @Override // X.G0U
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(com.facebook.aura.navigation.AuraNavKey r3) {
            /*
                r2 = this;
                r0 = 0
                X.C7384Etj.A0Y(r3, r0)
                boolean r0 = r3 instanceof com.facebook.aura.rentalcars.RentalCarResultsScreenKey
                if (r0 == 0) goto L2f
                com.facebook.aura.rentalcars.RentalCarResultsScreenKey r3 = (com.facebook.aura.rentalcars.RentalCarResultsScreenKey) r3
                java.lang.String r1 = r3.hostMessageId
                com.facebook.aura.rentalcars.RentalCarDetailsScreenKey r0 = r2.$key
                java.lang.String r0 = r0.hostMessageId
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L2f
                java.lang.String r1 = r3.presentationId
                com.facebook.aura.rentalcars.RentalCarDetailsScreenKey r0 = r2.$key
                java.lang.String r0 = r0.presentationId
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L2f
                java.lang.String r1 = r3.sessionId
                com.facebook.aura.rentalcars.RentalCarDetailsScreenKey r0 = r2.$key
                java.lang.String r0 = r0.sessionId
                boolean r1 = X.C7384Etj.areEqual(r1, r0)
                r0 = 1
                if (r1 != 0) goto L30
            L2f:
                r0 = 0
            L30:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.rentalcars.RentalCarBookingKt.AnonymousClass2.invoke(com.facebook.aura.navigation.AuraNavKey):java.lang.Boolean");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RentalCarDetailsScreenKey rentalCarDetailsScreenKey) {
            super(1);
            this.$key = rentalCarDetailsScreenKey;
        }
    }

    public static final String rentalCarBookingMessage(RentalCarRate rentalCarRate, BFM bfm, int i) {
        C7384Etj.A0Y(rentalCarRate, 0);
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        String strUnicodeWrap = bidiFormatter.unicodeWrap(rentalCarRate.car.name);
        C7384Etj.A0U(strUnicodeWrap);
        String strUnicodeWrap2 = bidiFormatter.unicodeWrap(rentalCarRate.supplier.name);
        C7384Etj.A0U(strUnicodeWrap2);
        RentalCarStop rentalCarStop = rentalCarRate.pickup;
        RentalCarStop rentalCarStop2 = rentalCarRate.dropoff;
        Locale localeA0w = C60Q.A0w();
        LocalDate localDateNow = LocalDate.now();
        C7384Etj.A0U(localDateNow);
        return AbstractC2271BQs.A02(bfm, new Object[]{strUnicodeWrap, strUnicodeWrap2, RentalCarFormattingKt.formatRentalPeriod(rentalCarStop, rentalCarStop2, localeA0w, localDateNow), RentalCarFormattingKt.formatted(rentalCarRate.total, C60Q.A0w(), false)}, R.string._name_removed__res_0x7f120580);
    }

    public static final boolean sendRentalCarBookingMessage(AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, RentalCarDetailsScreenKey rentalCarDetailsScreenKey, String str) {
        AnonymousClass005.A14(abstractC3358CGz, auraNavigator, rentalCarDetailsScreenKey, str);
        return ConversationSourceChatReturnKt.returnToSourceChat(auraNavigator, rentalCarDetailsScreenKey, rentalCarDetailsScreenKey.sessionId, new AnonymousClass1(abstractC3358CGz, str), new AnonymousClass2(rentalCarDetailsScreenKey));
    }
}
