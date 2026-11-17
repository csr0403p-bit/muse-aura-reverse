package com.facebook.aura.hotels;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.conversation.viewmodel.ConversationSourceChatReturnKt;
import com.facebook.aura.conversation.viewmodel.HatchConversationComposerController;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;

/* loaded from: classes4.dex */
public abstract class HotelRoomComposerActionsKt {

    /* renamed from: com.facebook.aura.hotels.HotelRoomComposerActionsKt$openHotelRoomComposer$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<String, Boolean> {
        public final /* synthetic */ String $prompt;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        @Override // X.G0U
        public final Boolean invoke(String str) {
            C7384Etj.A0Y(str, 0);
            return Boolean.valueOf(HatchConversationComposerController.Companion.getInstance(this.$userSession).requestDraft(str, this.$prompt));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz, String str) {
            super(1);
            this.$userSession = abstractC3358CGz;
            this.$prompt = str;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelRoomComposerActionsKt$returnToHotelSourceChat$1, reason: invalid class name and case insensitive filesystem */
    public final class C122011 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public final /* synthetic */ HotelSelectionSheetKey $key;

        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
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
                boolean r0 = r3 instanceof com.facebook.aura.hotels.HotelResultsScreenKey
                if (r0 == 0) goto L23
                com.facebook.aura.hotels.HotelResultsScreenKey r3 = (com.facebook.aura.hotels.HotelResultsScreenKey) r3
                java.lang.String r1 = r3.searchRef
                com.facebook.aura.hotels.HotelSelectionSheetKey r0 = r2.$key
                java.lang.String r0 = r0.searchRef
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L23
                java.lang.String r1 = r3.sessionId
                com.facebook.aura.hotels.HotelSelectionSheetKey r0 = r2.$key
                java.lang.String r0 = r0.sessionId
                boolean r1 = X.C7384Etj.areEqual(r1, r0)
                r0 = 1
                if (r1 != 0) goto L24
            L23:
                r0 = 0
            L24:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelRoomComposerActionsKt.C122011.invoke(com.facebook.aura.navigation.AuraNavKey):java.lang.Boolean");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122011(HotelSelectionSheetKey hotelSelectionSheetKey) {
            super(1);
            this.$key = hotelSelectionSheetKey;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelRoomComposerActionsKt$sendHotelBookingMessage$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes6.dex */
    public final class C122021 extends AbstractC7559F3s implements G0U<String, Boolean> {
        public final /* synthetic */ String $message;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        @Override // X.G0U
        public final Boolean invoke(String str) {
            C7384Etj.A0Y(str, 0);
            return Boolean.valueOf(HatchConversationComposerController.Companion.getInstance(this.$userSession).requestSend(str, this.$message));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122021(AbstractC3358CGz abstractC3358CGz, String str) {
            super(1);
            this.$userSession = abstractC3358CGz;
            this.$message = str;
        }
    }

    public static final boolean returnToHotelSourceChat(AuraNavigator auraNavigator, HotelSelectionSheetKey hotelSelectionSheetKey, G0U<? super String, Boolean> g0u) {
        return ConversationSourceChatReturnKt.returnToSourceChat(auraNavigator, hotelSelectionSheetKey, hotelSelectionSheetKey.sessionId, g0u, new C122011(hotelSelectionSheetKey));
    }

    public static final boolean openHotelRoomComposer(AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, HotelSelectionSheetKey hotelSelectionSheetKey, String str) {
        AnonymousClass005.A14(abstractC3358CGz, auraNavigator, hotelSelectionSheetKey, str);
        return returnToHotelSourceChat(auraNavigator, hotelSelectionSheetKey, new AnonymousClass1(abstractC3358CGz, str));
    }

    public static final boolean sendHotelBookingMessage(AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, HotelSelectionSheetKey hotelSelectionSheetKey, String str) {
        AnonymousClass005.A14(abstractC3358CGz, auraNavigator, hotelSelectionSheetKey, str);
        return returnToHotelSourceChat(auraNavigator, hotelSelectionSheetKey, new C122021(abstractC3358CGz, str));
    }
}
