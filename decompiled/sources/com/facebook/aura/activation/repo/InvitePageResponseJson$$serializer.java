package com.facebook.aura.activation.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5hV;
import X.C60O;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.activation.model.HatchInviteLogging;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.user.provider.AuraViewerDataProviderKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class InvitePageResponseJson$$serializer implements C9cd<InvitePageResponseJson> {
    public static final InvitePageResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final InvitePageResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        RedeemInviteCodeSuccessScreenJson redeemInviteCodeSuccessScreenJson = null;
        String strA0g = null;
        String strA0j = null;
        RedeemInviteCodeScreenJson redeemInviteCodeScreenJson = null;
        InviteGiftVideoJson inviteGiftVideoJson = null;
        InviteRewardJson inviteRewardJson = null;
        String str = null;
        Integer num = null;
        String strA0n = null;
        String strA0l = null;
        String strA0m = null;
        String strA0p = null;
        String strA0w = null;
        String strA0f = null;
        int i2 = 0;
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new InvitePageResponseJson(i2, strA0w, strA0f, strA0j, strA0g, strA0l, strA0m, strA0n, num, str, strA0p, zA8G2, zA8G, zA8G3, inviteRewardJson, inviteGiftVideoJson, redeemInviteCodeScreenJson, redeemInviteCodeSuccessScreenJson, (C2hx) null);
                case 0:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0f = C3cI.A0f(c9iZ, c9j4A55);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i2 |= 4;
                    continue;
                case 3:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i2 |= 16;
                    continue;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i2 |= 32;
                    continue;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i2 |= 64;
                    continue;
                case 7:
                    num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i2 |= 256;
                    continue;
                case 9:
                    strA0p = C3cI.A0p(c9iZ, c9j4A55);
                    i2 |= 512;
                    continue;
                case 10:
                    zA8G2 = c9j4A55.A8G(c9iZ, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    zA8G = c9j4A55.A8G(c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    zA8G3 = c9j4A55.A8G(c9iZ, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    inviteRewardJson = (InviteRewardJson) c9j4A55.A8Z(InviteRewardJson$$serializer.INSTANCE, c9iZ, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    inviteGiftVideoJson = (InviteGiftVideoJson) c9j4A55.A8Z(InviteGiftVideoJson$$serializer.INSTANCE, c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    redeemInviteCodeScreenJson = (RedeemInviteCodeScreenJson) c9j4A55.A8Z(RedeemInviteCodeScreenJson$$serializer.INSTANCE, c9iZ, 15);
                    i = 32768;
                    break;
                case 16:
                    redeemInviteCodeSuccessScreenJson = (RedeemInviteCodeSuccessScreenJson) c9j4A55.A8Z(RedeemInviteCodeSuccessScreenJson$$serializer.INSTANCE, c9iZ, 16);
                    i = 65536;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        InvitePageResponseJson$$serializer invitePageResponseJson$$serializer = new InvitePageResponseJson$$serializer();
        INSTANCE = invitePageResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.activation.repo.InvitePageResponseJson", invitePageResponseJson$$serializer, 17);
        C3cH.A1G(HatchInviteLogging.KEY_INVITE_STATE, c9iKA1C, true);
        C60O.A1W(c9iKA1C, true);
        c9iKA1C.A08("subtitle_link_text", true);
        c9iKA1C.A08("subtitle_link_url", true);
        c9iKA1C.A08(AuraDeeplinkRouteMapper.CODE_PARAM, true);
        c9iKA1C.A08("invite_link", true);
        c9iKA1C.A08("uses_remaining", true);
        c9iKA1C.A08("share_text", true);
        c9iKA1C.A08("story_share_text", true);
        c9iKA1C.A08("show_gift", true);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_HAS_REDEEMED_INVITE_CODE, true);
        c9iKA1C.A08("show_redeem_button", true);
        c9iKA1C.A08("reward", true);
        c9iKA1C.A08("gift_video", true);
        c9iKA1C.A08("redeem_invite_code_screen", true);
        c9iKA1C.A08("redeem_invite_code_success_screen", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA004 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA005 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA006 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA007 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA008 = AbstractC07749im.A00(C07729ii.A00);
        C9hr c9hrA009 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA0010 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c9hrA00, c9hrA002, c9hrA003, c9hrA004, c9hrA005, c9hrA006, c9hrA007, c9hrA008, c9hrA009, c9hrA0010, c07839ix, c07839ix, c07839ix, AbstractC07749im.A00(InviteRewardJson$$serializer.INSTANCE), AbstractC07749im.A00(InviteGiftVideoJson$$serializer.INSTANCE), AbstractC07749im.A00(RedeemInviteCodeScreenJson$$serializer.INSTANCE), AbstractC07749im.A00(RedeemInviteCodeSuccessScreenJson$$serializer.INSTANCE)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, InvitePageResponseJson invitePageResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, invitePageResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        InvitePageResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(invitePageResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
