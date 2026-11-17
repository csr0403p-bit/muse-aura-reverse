package com.facebook.aura.conversation.view;

import X.AGI;
import X.AHD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C3U4;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntities;
import com.facebook.aura.conversation.view.richcontent.HatchInlineImageData;
import com.facebook.aura.conversation.view.richcontent.LocalIsPrimaryThreadKt;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.model.HatchContentViewModelData;
import com.facebook.aura.model.HatchMessageChannel;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchMessageBubbleContentKt {
    public static final float INLINE_CODE_BUBBLE_BG_ALPHA = 0.1f;
    public static final float UserMediaSingleImageSize = 280.0f;

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageBubbleContentKt$ChannelFooter$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchMessageRole $role;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, HatchMessageRole hatchMessageRole, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$role = hatchMessageRole;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageBubbleContentKt.ChannelFooter(this.$text, this.$role, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageBubbleContentKt$HatchMessageEntityProviders$1, reason: invalid class name and case insensitive filesystem */
    public final class C114851 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ HatchMessageUiModel $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114851(HatchMessageUiModel hatchMessageUiModel, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$message = hatchMessageUiModel;
            this.$content = g0v;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageBubbleContentKt.HatchMessageEntityProviders(this.$message, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final String getChannelFooterText(HatchMessageChannel hatchMessageChannel, BFM bfm, int i) {
        String strA0t = null;
        if (hatchMessageChannel == null) {
            bfm.AgE(-1177851280);
        } else {
            bfm.AgE(-1177851279);
            strA0t = AnonymousClass001.A0t(bfm, HatchChannelDisplayNameKt.channelDisplayName(hatchMessageChannel, null, bfm, 0, 2), R.string._name_removed__res_0x7f12046c);
        }
        AnonymousClass002.A19(bfm);
        return strA0t;
    }

    public static final AHD<HatchContentViewModelData> stripImagesFromRichContent(AHD<? extends HatchContentViewModelData> ahd) {
        if (ahd == null || ahd.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : ahd) {
            if (!(obj instanceof HatchContentViewModelData.InlineImage) && !(obj instanceof HatchContentViewModelData.InlineImageGroup)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return AGI.A07(arrayList);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchMessageRole.values().length];
            try {
                AnonymousClass002.A13(HatchMessageRole.USER, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchMessageRole.AGENT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ChannelFooter(String str, HatchMessageRole hatchMessageRole, BRg bRg, BFM bfm, int i, int i2) {
        float f;
        BRg bRg2 = bRg;
        bfm.AgG(-1886709395);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass005.A09(bfm, hatchMessageRole);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            float f2 = 0.0f;
            if (hatchMessageRole == HatchMessageRole.AGENT) {
                f2 = 12.0f;
                f = 0.0f;
            } else {
                f = 12.0f;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0C(bRg2, f2, 0.0f, f, 12.0f), C06G.A08(bfm), C06G.A0S(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14832);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, hatchMessageRole, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0657 A[PHI: r54
  0x0657: PHI (r54v2 boolean) = (r54v0 boolean), (r54v3 boolean) binds: [B:226:0x056c, B:224:0x0568] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017a  */
    /* renamed from: HatchMessageBubbleContent-z756j2U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m633HatchMessageBubbleContentz756j2U(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r82, kotlin.jvm.functions.Function0<java.lang.Float> r83, X.C3TH r84, kotlin.jvm.functions.Function0<java.lang.String> r85, X.BRg r86, com.facebook.aura.identity.provider.HatchConversationTheme r87, X.B6A r88, float r89, com.facebook.aura.conversation.view.InlineContentCallbacks r90, X.G0U<? super java.lang.String, kotlin.Unit> r91, X.G2j<? super X.AHD<java.lang.String>, ? super java.lang.Boolean, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r92, X.G0U<? super com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, kotlin.Unit> r93, X.G0U<? super X.BLU, kotlin.Unit> r94, X.BFM r95, int r96, int r97, int r98) {
        /*
            Method dump skipped, instructions count: 2273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageBubbleContentKt.m633HatchMessageBubbleContentz756j2U(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, kotlin.jvm.functions.Function0, X.3TH, kotlin.jvm.functions.Function0, X.BRg, com.facebook.aura.identity.provider.HatchConversationTheme, X.B6A, float, com.facebook.aura.conversation.view.InlineContentCallbacks, X.G0U, X.G2j, X.G0U, X.G0U, X.BFM, int, int, int):void");
    }

    public static final AHD<HatchInlineImageData> extractUserMediaImages(HatchMessageUiModel hatchMessageUiModel) {
        AHD<HatchContentViewModelData> ahd;
        if (hatchMessageUiModel.role == HatchMessageRole.USER && (ahd = hatchMessageUiModel.richContent) != null) {
            ArrayList arrayList = new ArrayList();
            for (HatchContentViewModelData hatchContentViewModelData : ahd) {
                if (hatchContentViewModelData instanceof HatchContentViewModelData.InlineImage) {
                    HatchContentViewModelData.InlineImage inlineImage = (HatchContentViewModelData.InlineImage) hatchContentViewModelData;
                    arrayList.add(new HatchInlineImageData(inlineImage.url, inlineImage.alt, inlineImage.deleted, inlineImage.workspacePath));
                } else if (hatchContentViewModelData instanceof HatchContentViewModelData.InlineImageGroup) {
                    for (HatchContentViewModelData.InlineImage inlineImage2 : ((HatchContentViewModelData.InlineImageGroup) hatchContentViewModelData).images) {
                        arrayList.add(new HatchInlineImageData(inlineImage2.url, inlineImage2.alt, inlineImage2.deleted, inlineImage2.workspacePath));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return AGI.A07(arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.Alignment rememberTextStartAlignment(java.lang.String r3, X.BFM r4, int r5) {
        /*
            r0 = r5 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto Ld
            boolean r0 = r4.A65(r3)
            if (r0 != 0) goto L12
        Ld:
            r0 = r5 & 6
            r1 = 0
            if (r0 != r2) goto L13
        L12:
            r1 = 1
        L13:
            java.lang.Object r0 = r4.AaT()
            if (r1 != 0) goto L1d
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L29
        L1d:
            int r1 = com.facebook.aura.markdown.render.BlockTextDirectionKt.blockTextDirection(r3)
            r0 = 2
            if (r1 != r0) goto L2c
            androidx.compose.ui.Alignment r0 = X.C2VG.A05
        L26:
            r4.Ai0(r0)
        L29:
            androidx.compose.ui.Alignment r0 = (androidx.compose.ui.Alignment) r0
            return r0
        L2c:
            r0 = 1
            if (r1 != r0) goto L32
            androidx.compose.ui.Alignment r0 = X.C2VG.A04
            goto L26
        L32:
            androidx.compose.ui.Alignment r0 = X.C2VU.A0E
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageBubbleContentKt.rememberTextStartAlignment(java.lang.String, X.BFM, int):androidx.compose.ui.Alignment");
    }

    public static final void HatchMessageEntityProviders(HatchMessageUiModel hatchMessageUiModel, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        bfm.AgG(1741813441);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchMessageUiModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            ConversationInlineEntities.INSTANCE.ProvideInlineEntities(hatchMessageUiModel.inlineEntityState, hatchMessageUiModel.id, hatchMessageUiModel.sessionId, AnonymousClass003.A1G(bfm, LocalIsPrimaryThreadKt.LocalIsPrimaryThread), g0v, bfm, ((iA05 << 9) & 57344) | 196608);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114851(hatchMessageUiModel, g0v, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg channelFooterTap(X.BRg r5, final kotlin.jvm.functions.Function0<kotlin.Unit> r6, X.BFM r7, int r8) {
        /*
            r0 = 1382989509(0x526ebec5, float:2.563507E11)
            r7.AgE(r0)
            if (r6 == 0) goto L87
            r0 = r8 & 112(0x70, float:1.57E-43)
            r4 = r0 ^ 48
            r3 = 32
            if (r4 <= r3) goto L16
            boolean r0 = r7.A65(r6)
            if (r0 != 0) goto L1b
        L16:
            r0 = r8 & 48
            r1 = 0
            if (r0 != r3) goto L1c
        L1b:
            r1 = 1
        L1c:
            java.lang.Object r0 = r7.AaT()
            if (r1 != 0) goto L26
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L2e
        L26:
            com.facebook.aura.conversation.view.HatchMessageBubbleContentKt$channelFooterTap$1$1 r0 = new com.facebook.aura.conversation.view.HatchMessageBubbleContentKt$channelFooterTap$1$1
            r0.<init>()
            r7.Ai0(r0)
        L2e:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r0 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r0
            X.BRg r2 = X.AaM.A00(r5, r0, r6)
            r1 = 0
            r0 = 1
            X.BRg r2 = X.C1O5.A00(r1, r2, r0)
            if (r4 <= r3) goto L42
            boolean r0 = r7.A65(r6)
            if (r0 != 0) goto L47
        L42:
            r0 = r8 & 48
            r1 = 0
            if (r0 != r3) goto L48
        L47:
            r1 = 1
        L48:
            java.lang.Object r0 = r7.AaT()
            if (r1 != 0) goto L52
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L5a
        L52:
            com.facebook.aura.conversation.view.HatchMessageBubbleContentKt$channelFooterTap$2$1 r0 = new com.facebook.aura.conversation.view.HatchMessageBubbleContentKt$channelFooterTap$2$1
            r0.<init>(r6)
            r7.Ai0(r0)
        L5a:
            X.G0U r0 = (X.G0U) r0
            X.BRg r2 = X.AXZ.A00(r2, r0)
            if (r4 <= r3) goto L68
            boolean r0 = r7.A65(r6)
            if (r0 != 0) goto L6d
        L68:
            r1 = r8 & 48
            r0 = 0
            if (r1 != r3) goto L6e
        L6d:
            r0 = 1
        L6e:
            java.lang.Object r1 = r7.AaT()
            if (r0 != 0) goto L78
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L80
        L78:
            com.facebook.aura.conversation.view.HatchMessageBubbleContentKt$channelFooterTap$3$1 r1 = new com.facebook.aura.conversation.view.HatchMessageBubbleContentKt$channelFooterTap$3$1
            r1.<init>(r6)
            r7.Ai0(r1)
        L80:
            X.G0U r1 = (X.G0U) r1
            r0 = 0
            X.BRg r5 = X.ARD.A01(r2, r1, r0)
        L87:
            X.AnonymousClass002.A19(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageBubbleContentKt.channelFooterTap(X.BRg, kotlin.jvm.functions.Function0, X.BFM, int):X.BRg");
    }

    public static final String messageSender(HatchMessageRole hatchMessageRole, Function0<String> function0, BFM bfm, int i) {
        String strA01;
        int iOrdinal = hatchMessageRole.ordinal();
        if (iOrdinal == 0) {
            bfm.AgE(783626542);
            strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12046e);
        } else {
            if (iOrdinal != 1) {
                throw AnonymousClass005.A0k(bfm, 783625253);
            }
            bfm.AgE(783629277);
            strA01 = AnonymousClass001.A0t(bfm, function0.invoke(), R.string._name_removed__res_0x7f12046d);
        }
        AnonymousClass001.A1D(bfm);
        return strA01;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean rememberStreamSettleActive(boolean r8, X.BFM r9, int r10) {
        /*
            java.lang.Object r0 = r9.AaT()
            java.lang.Object r7 = X.C78N.A00
            r6 = 0
            r5 = 0
            java.lang.Object r4 = X.AnonymousClass005.A0g(r9, r0, r7, r5)
            androidx.compose.runtime.MutableState r4 = (androidx.compose.runtime.MutableState) r4
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            r0 = r10 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L1f
            boolean r0 = r9.A66(r8)
            if (r0 != 0) goto L24
        L1f:
            r0 = r10 & 6
            r1 = 0
            if (r0 != r2) goto L25
        L24:
            r1 = 1
        L25:
            java.lang.Object r0 = r9.AaT()
            if (r1 != 0) goto L2d
            if (r0 != r7) goto L35
        L2d:
            com.facebook.aura.conversation.view.HatchMessageBubbleContentKt$rememberStreamSettleActive$1$1 r0 = new com.facebook.aura.conversation.view.HatchMessageBubbleContentKt$rememberStreamSettleActive$1$1
            r0.<init>(r8, r4, r6)
            r9.Ai0(r0)
        L35:
            X.AnonymousClass001.A18(r9, r0, r3)
            if (r8 != 0) goto L40
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r4)
            if (r0 == 0) goto L41
        L40:
            r5 = 1
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageBubbleContentKt.rememberStreamSettleActive(boolean, X.BFM, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013d  */
    /* renamed from: HatchMessageContent-ZdSQAXI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m634HatchMessageContentZdSQAXI(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r68, X.BRg r69, kotlin.jvm.functions.Function0<kotlin.Unit> r70, X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r71, X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r72, X.G0V<? super X.AHD<com.facebook.aura.conversation.view.richcontent.HatchInlineImageData>, ? super java.lang.Integer, kotlin.Unit> r73, X.G0U<? super java.lang.String, kotlin.Unit> r74, X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r75, X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r76, X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r77, X.G0U<? super com.facebook.aura.model.HatchContentViewModelData, kotlin.Unit> r78, X.G0U<? super java.lang.String, kotlin.Unit> r79, java.lang.String r80, X.B6A r81, X.B6A r82, boolean r83, java.lang.String r84, kotlin.jvm.functions.Function0<kotlin.Unit> r85, kotlin.jvm.functions.Function0<kotlin.Unit> r86, boolean r87, X.G0U<? super java.lang.String, kotlin.Unit> r88, boolean r89, java.lang.String r90, java.lang.String r91, X.BFM r92, int r93, int r94, int r95, int r96) {
        /*
            Method dump skipped, instructions count: 1404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageBubbleContentKt.m634HatchMessageContentZdSQAXI(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, X.BRg, kotlin.jvm.functions.Function0, X.G0V, X.G0V, X.G0V, X.G0U, X.G0V, X.G0V, X.G0V, X.G0U, X.G0U, java.lang.String, X.B6A, X.B6A, boolean, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, X.G0U, boolean, java.lang.String, java.lang.String, X.BFM, int, int, int, int):void");
    }
}
