package com.facebook.aura.nodes.cards;

import X.AHD;
import X.AKQ;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BV3;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C0881AGi;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C2VU;
import X.C3U4;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60N;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C7Je;
import X.C7mU;
import X.CFK;
import X.F60;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.HzP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchMessagingCardKt {
    public static final float APP_ROW_PLACEHOLDER_HEIGHT = 24.0f;
    public static final float BODY_ICON_ARTWORK_INSET = 8.0f;
    public static final int BODY_PREVIEW_MAX_LINES = 4;
    public static final String FALLBACK_MIME = "*/*";
    public static final String TAG = "HatchMessagingCard";

    /* renamed from: com.facebook.aura.nodes.cards.HatchMessagingCardKt$HatchMessagingCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ MessagingCardData $data;
        public final /* synthetic */ boolean $inBubble;
        public final /* synthetic */ boolean $isFreshlyArrived;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MessagingCardData messagingCardData, BRg bRg, boolean z, boolean z2, int i, int i2) {
            super(2);
            this.$data = messagingCardData;
            this.$modifier = bRg;
            this.$isFreshlyArrived = z;
            this.$inBubble = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessagingCardKt.HatchMessagingCard(this.$data, this.$modifier, this.$isFreshlyArrived, this.$inBubble, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.cards.HatchMessagingCardKt", f = "HatchMessagingCard.kt", l = {HatchMessageShareDocumentRenderer.CONTENT_TOP_PX}, m = "openMessagingWithAttachments", v = 2)
    /* renamed from: com.facebook.aura.nodes.cards.HatchMessagingCardKt$openMessagingWithAttachments$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchMessagingCardKt.openMessagingWithAttachments(null, null, null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    public static final void HatchMessagingCard(MessagingCardData messagingCardData, BRg bRg, boolean z, boolean z2, BFM bfm, int i, int i2) {
        ?? r13;
        String str;
        BRg bRg2 = bRg;
        boolean zA1K = z;
        boolean zA1K2 = z2;
        C7384Etj.A0Y(messagingCardData, 0);
        bfm.AgG(-584932047);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(messagingCardData, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, zA1K);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, zA1K2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            zA1K = C3cG.A1K(i4, zA1K);
            zA1K2 = C3cG.A1K(i5, zA1K2);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
            int i6 = iA05 & 14;
            boolean z3 = i6 == 4 || ((iA05 & 8) != 0 && bfm.A65(messagingCardData));
            Object objAaT2 = bfm.AaT();
            if (z3 || objAaT2 == obj) {
                objAaT2 = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT2;
            boolean z4 = i6 == 4 || ((iA05 & 8) != 0 && bfm.A65(messagingCardData));
            Object objAaT3 = bfm.AaT();
            if (z4 || objAaT3 == obj) {
                objAaT3 = AnonymousClass004.A11(bfm, C0881AGi.A00);
            }
            MutableState mutableState2 = (MutableState) objAaT3;
            boolean z5 = i6 == 4 || ((iA05 & 8) != 0 && bfm.A65(messagingCardData));
            Object objAaT4 = bfm.AaT();
            if (z5 || objAaT4 == obj) {
                objAaT4 = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState3 = (MutableState) objAaT4;
            boolean zA1T = AnonymousClass005.A1T(bfm, mutableState, mutableState2, mutableState3, bfm.A67(contextA0H) | (i6 == 4 || ((iA05 & 8) != 0 && bfm.A67(messagingCardData))));
            Object objAaT5 = bfm.AaT();
            if (zA1T || objAaT5 == obj) {
                objAaT5 = new HatchMessagingCardKt$HatchMessagingCard$1$1(contextA0H, messagingCardData, mutableState, mutableState2, mutableState3, null);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A18(bfm, objAaT5, messagingCardData);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3cI.A07(bRg2.then(c1062ATq), zA1K2, bfm, iA05 >> 9);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(12.0f), bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                if (MutableState.A0A(mutableState3) && mutableState.getValue() == null) {
                    bfm.AgE(-791522629);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(-791761918);
                    MessagingApp messagingApp = (MessagingApp) mutableState.getValue();
                    if (messagingApp != null) {
                        bfm.AgE(-791713961);
                        NodeCardComponentsKt.NodeCardAppRow(messagingApp.label, messagingApp.icon, null, bfm, 0, 4);
                        BBI.A0R(bbi, false);
                    } else {
                        bfm.AgE(-791639716);
                        C01N.A04(bfm, bbi, c1062ATq, APP_ROW_PLACEHOLDER_HEIGHT, false);
                    }
                    AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
                    BBI.A0R(bbi, false);
                }
                bfm.AgE(-995363041);
                Iterator it = messagingCardData.recipients.iterator();
                int i7 = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            break;
                        }
                        MessagingCardRecipient messagingCardRecipient = (MessagingCardRecipient) next;
                        bfm.Ag8(-1721199321, bfm.APR(Integer.valueOf(i7), messagingCardRecipient.address));
                        ContactInfo contactInfo = (ContactInfo) AbstractC0878AGe.A0A(i7, (List) mutableState2.getValue());
                        boolean zA65 = bfm.A65(messagingCardRecipient.address);
                        Object objAaT6 = bfm.AaT();
                        if (zA65 || objAaT6 == obj) {
                            objAaT6 = CallingCardResolverKt.formatPhoneNumberForDisplay(messagingCardRecipient.address);
                            bfm.Ai0(objAaT6);
                        }
                        String str2 = (String) objAaT6;
                        String str3 = messagingCardRecipient.contactName;
                        if (str3 != null) {
                            str = contactInfo != null ? contactInfo.photoUri : null;
                        } else if (contactInfo != null) {
                            str3 = contactInfo.name;
                        } else {
                            str3 = null;
                        }
                        NodeCardComponentsKt.NodeCardContactRow(str3, str2, str, null, bfm, 0, 8);
                        BBI.A0R(bbi, false);
                        i7 = i8;
                    } else {
                        BBI.A0R(bbi, false);
                        bfm.AgE(-995343556);
                        int i9 = 0;
                        for (Object obj2 : messagingCardData.attachments) {
                            int i10 = i9 + 1;
                            if (i9 >= 0) {
                                MessagingCardAttachment messagingCardAttachment = (MessagingCardAttachment) obj2;
                                bfm.Ag8(-1042662415, bfm.APR(Integer.valueOf(i9), messagingCardAttachment.path));
                                NodeCardFileChipKt.NodeCardFileChip(displayName(messagingCardAttachment), messagingCardAttachment.mimeType, null, bfm, 0, 4);
                                BBI.A0R(bbi, false);
                                i9 = i10;
                            }
                        }
                        BBI.A0R(bbi, false);
                        if (C7BY.A0j(messagingCardData.body)) {
                            r13 = 1;
                            bfm.AgE(-790266757);
                            BBI.A0R(bbi, false);
                        } else {
                            bfm.AgE(-790659806);
                            MessagingApp messagingApp2 = (MessagingApp) mutableState.getValue();
                            float f = (messagingApp2 == null || messagingApp2.icon == null) ? 0.0f : BODY_ICON_ARTWORK_INSET;
                            String str4 = messagingCardData.body;
                            AuraTheme auraTheme = AuraTheme.INSTANCE;
                            r13 = 1;
                            AuraTextKt.m2639AuraTextUY9GdpU(str4, C3U4.A0C(c1062ATq, f, 0.0f, 0.0f, 0.0f), C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 4, 2, null, null, null, bfm, 805306368, 6, 14832);
                            BBI.A0R(bbi, false);
                        }
                        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b80);
                        AuraLabelButtonStyle auraLabelButtonStyleSecondaryOutlined = AuraButtonStyles.INSTANCE.secondaryOutlined(null, bfm, 48, r13);
                        AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                        boolean zA1V = AnonymousClass005.A1V(bfm, contextA0H, c3ux, abstractC3358CGzA0g, i6 == 4 || ((iA05 & 8) != 0 && bfm.A67(messagingCardData)));
                        Object objAaT7 = bfm.AaT();
                        if (zA1V || objAaT7 == obj) {
                            objAaT7 = new HatchMessagingCardKt$HatchMessagingCard$2$3$1(messagingCardData, contextA0H, c3ux, abstractC3358CGzA0g);
                            bfm.Ai0(objAaT7);
                        }
                        AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStyleSecondaryOutlined, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT7, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
                        boolean z6 = i6 == 4 || ((iA05 & 8) != 0 && bfm.A65(messagingCardData));
                        Object objAaT8 = bfm.AaT();
                        if (z6 || objAaT8 == obj) {
                            AHD<MessagingCardRecipient> ahd = messagingCardData.recipients;
                            ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
                            Iterator it2 = ahd.iterator();
                            while (it2.hasNext()) {
                                arrayListA0i.add(((MessagingCardRecipient) it2.next()).address);
                            }
                            objAaT8 = String.valueOf(AbstractC0878AGe.A0Q(messagingCardData.body, arrayListA0i).hashCode());
                            bfm.Ai0(objAaT8);
                        }
                        DefaultAssistantUpsellKt.DefaultAssistantUpsell((String) objAaT8, zA1K, null, bfm, (iA05 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 4);
                        BBI.A0R(bbi, r13);
                    }
                }
                AbstractC0885AGm.A14();
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(messagingCardData, bRg2, zA1K, zA1K2, i, i2);
        }
    }

    public static final String displayName(MessagingCardAttachment messagingCardAttachment) {
        String strA0R = messagingCardAttachment.fileName;
        if (strA0R == null) {
            String str = messagingCardAttachment.path;
            strA0R = C7BY.A0R(str, str, '/');
            if (C7BY.A0j(strA0R) || strA0R == null) {
                return messagingCardAttachment.path;
            }
        }
        return strA0R;
    }

    public static final void openMessaging(Context context, List<String> list, String str) {
        Uri uriA01 = null;
        try {
            uriA01 = C7Je.A01(FGI.A0M("sms:", C3cH.A0e(",", list)));
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        if (uriA01 != null) {
            Intent intent = new Intent(C60N.A00(59), uriA01);
            intent.addFlags(268435456);
            intent.putExtra("sms_body", str);
            try {
                C3cI.A18(context, intent);
            } catch (ActivityNotFoundException e) {
                CFK.A0A(TAG, "No SMS app available to open", e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object openMessagingWithAttachments(android.content.Context r7, X.AbstractC3358CGz r8, java.util.List<java.lang.String> r9, java.lang.String r10, java.util.List<com.facebook.aura.nodes.cards.MessagingCardAttachment> r11, X.HtJ<? super kotlin.Unit> r12) {
        /*
            boolean r0 = r12 instanceof com.facebook.aura.nodes.cards.HatchMessagingCardKt.AnonymousClass1
            if (r0 == 0) goto Lc4
            r5 = r12
            com.facebook.aura.nodes.cards.HatchMessagingCardKt$openMessagingWithAttachments$1 r5 = (com.facebook.aura.nodes.cards.HatchMessagingCardKt.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc4
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r6 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 0
            r2 = 1
            if (r0 == 0) goto La8
            if (r0 != r2) goto Lcb
            java.lang.Object r10 = r5.L$3
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r5.L$2
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r7 = r5.L$0
            android.content.Context r7 = (android.content.Context) r7
            X.Hwg.A00(r6)
        L2d:
            java.util.List r6 = (java.util.List) r6
            boolean r0 = r6.isEmpty()
            java.lang.String r4 = "HatchMessagingCard"
            if (r0 == 0) goto L42
            java.lang.String r0 = "No attachments could be fetched; opening text-only draft"
            X.CFK.A06(r4, r0)
            openMessaging(r7, r9, r10)
        L3f:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L42:
            java.util.ArrayList r5 = X.AnonymousClass003.A0i(r6)
            java.util.Iterator r1 = r6.iterator()
        L4a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r1.next()
            X.HxE r0 = (X.HxE) r0
            A r0 = r0.first
            r5.add(r0)
            goto L4a
        L5c:
            java.util.ArrayList r2 = X.C3cG.A0h()
            java.util.Iterator r1 = r6.iterator()
        L64:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r1.next()
            X.HxE r0 = (X.HxE) r0
            B r0 = r0.second
            if (r0 == 0) goto L64
            r2.add(r0)
            goto L64
        L78:
            java.util.List r0 = X.C3cG.A0m(r2)
            java.lang.Object r0 = X.AbstractC0878AGe.A0K(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L86
        */
        //  java.lang.String r0 = "*/*"
        /*
        L86:
            android.content.Intent r2 = buildMmsSendIntent(r7, r9, r10, r5, r0)
            java.lang.String r0 = android.provider.Telephony.Sms.getDefaultSmsPackage(r7)
            if (r0 == 0) goto L97
            r2.setPackage(r0)     // Catch: android.content.ActivityNotFoundException -> L9b
            X.C3cI.A18(r7, r2)     // Catch: android.content.ActivityNotFoundException -> L9b
            goto L3f
        L97:
            launchAttachmentChooser(r7, r2)     // Catch: android.content.ActivityNotFoundException -> L9b
            goto L3f
        L9b:
            r1 = move-exception
            java.lang.String r0 = "Default SMS app can't take the attachment intent; falling back to chooser"
            X.CFK.A0A(r4, r0, r1)
            r2.setPackage(r3)
            launchAttachmentChooser(r7, r2)
            goto L3f
        La8:
            X.78T r1 = X.AnonymousClass002.A0s(r6)
            com.facebook.aura.nodes.cards.HatchMessagingCardKt$openMessagingWithAttachments$downloaded$1 r0 = new com.facebook.aura.nodes.cards.HatchMessagingCardKt$openMessagingWithAttachments$downloaded$1
            r0.<init>(r11, r7, r8, r3)
            r5.L$0 = r7
            r5.L$1 = r3
            r5.L$2 = r9
            r5.L$3 = r10
            r5.L$4 = r3
            r5.label = r2
            java.lang.Object r6 = X.GAo.A00(r5, r1, r0)
            if (r6 != r4) goto L2d
            return r4
        Lc4:
            com.facebook.aura.nodes.cards.HatchMessagingCardKt$openMessagingWithAttachments$1 r5 = new com.facebook.aura.nodes.cards.HatchMessagingCardKt$openMessagingWithAttachments$1
            r5.<init>(r12)
            goto L12
        Lcb:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.cards.HatchMessagingCardKt.openMessagingWithAttachments(android.content.Context, X.CGz, java.util.List, java.lang.String, java.util.List, X.HtJ):java.lang.Object");
    }

    public static final Intent buildMmsSendIntent(Context context, List<String> list, String str, List<? extends Uri> list2, String str2) {
        Intent intent;
        int size = list2.size();
        String strA00 = AnonymousClass000.A00(38);
        if (size == 1) {
            intent = new Intent(AnonymousClass000.A00(12));
            intent.putExtra(strA00, (Parcelable) AbstractC0878AGe.A0J(list2));
        } else {
            intent = new Intent(BV3.A00(8));
            intent.putParcelableArrayListExtra(strA00, new ArrayList<>(list2));
        }
        intent.setType(str2);
        intent.putExtra("address", C3cH.A0e(";", list));
        intent.putExtra("sms_body", str);
        ClipData clipDataNewUri = ClipData.newUri(context.getContentResolver(), "attachment", (Uri) AbstractC0878AGe.A0F(list2));
        Iterator it = AbstractC0878AGe.A0Z(list2, 1).iterator();
        while (it.hasNext()) {
            clipDataNewUri.addItem(new ClipData.Item((Uri) it.next()));
        }
        intent.setClipData(clipDataNewUri);
        intent.addFlags(268435457);
        return intent;
    }

    public static final void launchAttachmentChooser(Context context, Intent intent) {
        try {
            C7mU.A00().A03().A05(context, Intent.createChooser(intent, null));
        } catch (ActivityNotFoundException e) {
            CFK.A0A(TAG, "No app available to send the attachment", e);
        }
    }
}
