package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import com.facebook.aura.file.view.PublishState;
import com.facebook.aura.ui.HatchPublishBottomSheetKt;
import com.facebook.aura.ui.HatchPublishChangesBottomSheetKt;
import com.facebook.aura.ui.HatchPublishFailedBottomSheetKt;
import com.facebook.aura.ui.HatchPublishSuccessBottomSheetKt;
import com.facebook.aura.ui.HatchPublishUnpublishedBottomSheetKt;
import com.facebook.aura.ui.HatchPublishUpToDateBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchArtifactPublishFlowKt {

    /* renamed from: com.facebook.aura.file.view.HatchArtifactPublishFlowKt$HatchArtifactPublishFlowSheets$14, reason: invalid class name */
    public final class AnonymousClass14 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchArtifactPublishFlow $flow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass14(HatchArtifactPublishFlow hatchArtifactPublishFlow, int i) {
            super(2);
            this.$flow = hatchArtifactPublishFlow;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchArtifactPublishFlowKt.HatchArtifactPublishFlowSheets(this.$flow, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void HatchArtifactPublishFlowSheets(HatchArtifactPublishFlow hatchArtifactPublishFlow, BFM bfm, int i) {
        boolean z;
        C7384Etj.A0Y(hatchArtifactPublishFlow, 0);
        bfm.AgG(182229388);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchArtifactPublishFlow) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            PublishState publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view = hatchArtifactPublishFlow.getPublishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view();
            if ((publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view instanceof PublishState.Hidden) || (publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view instanceof PublishState.Loading)) {
                bfm.AgE(-42793424);
            } else if (publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view instanceof PublishState.Ready) {
                bfm.AgE(-971207212);
                String str = hatchArtifactPublishFlow.fileName;
                int i2 = iA0d & 14;
                boolean zA1Q = AnonymousClass002.A1Q(i2, 4);
                Object objAaT = bfm.AaT();
                if (zA1Q || objAaT == C78N.A00) {
                    objAaT = new HatchArtifactPublishFlowKt$HatchArtifactPublishFlowSheets$1$1(hatchArtifactPublishFlow);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) objAaT;
                z = i2 == 4;
                Object objAaT2 = bfm.AaT();
                if (z || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchArtifactPublishFlowKt$HatchArtifactPublishFlowSheets$2$1(hatchArtifactPublishFlow);
                    bfm.Ai0(objAaT2);
                }
                HatchPublishBottomSheetKt.HatchPublishBottomSheet(str, function0, (Function0) objAaT2, bfm, 0);
            } else if (publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view instanceof PublishState.HasChanges) {
                bfm.AgE(-971200384);
                boolean z2 = ((PublishState.HasChanges) publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view).isUnpublishing;
                int i3 = iA0d & 14;
                boolean zA1Q2 = AnonymousClass002.A1Q(i3, 4);
                Object objAaT3 = bfm.AaT();
                if (zA1Q2 || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchArtifactPublishFlowKt$HatchArtifactPublishFlowSheets$3$1(hatchArtifactPublishFlow);
                    bfm.Ai0(objAaT3);
                }
                Function0 function02 = (Function0) objAaT3;
                boolean zA1Q3 = AnonymousClass002.A1Q(i3, 4);
                Object objAaT4 = bfm.AaT();
                if (zA1Q3 || objAaT4 == C78N.A00) {
                    objAaT4 = new HatchArtifactPublishFlowKt$HatchArtifactPublishFlowSheets$4$1(hatchArtifactPublishFlow);
                    bfm.Ai0(objAaT4);
                }
                Function0 function03 = (Function0) objAaT4;
                z = i3 == 4;
                Object objAaT5 = bfm.AaT();
                if (z || objAaT5 == C78N.A00) {
                    objAaT5 = new HatchArtifactPublishFlowKt$HatchArtifactPublishFlowSheets$5$1(hatchArtifactPublishFlow);
                    bfm.Ai0(objAaT5);
                }
                HatchPublishChangesBottomSheetKt.HatchPublishChangesBottomSheet(z2, function02, function03, (Function0) objAaT5, bfm, 0);
            } else if (publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view instanceof PublishState.UpToDate) {
                bfm.AgE(-971191189);
                String str2 = hatchArtifactPublishFlow.fileName;
                PublishState.UpToDate upToDate = (PublishState.UpToDate) publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view;
                String str3 = upToDate.url;
                boolean z3 = upToDate.isUnpublishing;
                int i4 = iA0d & 14;
                boolean zA1T = AnonymousClass001.A1T(bfm, publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view, AnonymousClass002.A1Q(i4, 4));
                Object objAaT6 = bfm.AaT();
                if (zA1T || objAaT6 == C78N.A00) {
                    objAaT6 = new HatchArtifactPublishFlowKt$HatchArtifactPublishFlowSheets$6$1(hatchArtifactPublishFlow, publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view);
                    bfm.Ai0(objAaT6);
                }
                Function0 function04 = (Function0) objAaT6;
                boolean zA1Q4 = AnonymousClass002.A1Q(i4, 4);
                Object objAaT7 = bfm.AaT();
                if (zA1Q4 || objAaT7 == C78N.A00) {
                    objAaT7 = new HatchArtifactPublishFlowKt$HatchArtifactPublishFlowSheets$7$1(hatchArtifactPublishFlow);
                    bfm.Ai0(objAaT7);
                }
                Function0 function05 = (Function0) objAaT7;
                z = i4 == 4;
                Object objAaT8 = bfm.AaT();
                if (z || objAaT8 == C78N.A00) {
                    objAaT8 = new HatchArtifactPublishFlowKt$HatchArtifactPublishFlowSheets$8$1(hatchArtifactPublishFlow);
                    bfm.Ai0(objAaT8);
                }
                HatchPublishUpToDateBottomSheetKt.HatchPublishUpToDateBottomSheet(str2, str3, z3, function04, function05, (Function0) objAaT8, bfm, 0);
            } else if (publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view instanceof PublishState.Success) {
                bfm.AgE(-971179845);
                String str4 = ((PublishState.Success) publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view).url;
                int i5 = iA0d & 14;
                boolean zA1T2 = AnonymousClass001.A1T(bfm, publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view, AnonymousClass002.A1Q(i5, 4));
                Object objAaT9 = bfm.AaT();
                if (zA1T2 || objAaT9 == C78N.A00) {
                    objAaT9 = new HatchArtifactPublishFlowKt$HatchArtifactPublishFlowSheets$9$1(hatchArtifactPublishFlow, publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view);
                    bfm.Ai0(objAaT9);
                }
                Function0 function06 = (Function0) objAaT9;
                z = i5 == 4;
                Object objAaT10 = bfm.AaT();
                if (z || objAaT10 == C78N.A00) {
                    objAaT10 = new HatchArtifactPublishFlowKt$HatchArtifactPublishFlowSheets$10$1(hatchArtifactPublishFlow);
                    bfm.Ai0(objAaT10);
                }
                HatchPublishSuccessBottomSheetKt.HatchPublishSuccessBottomSheet(str4, function06, (Function0) objAaT10, bfm, 0);
            } else if (publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view instanceof PublishState.Unpublished) {
                bfm.AgE(-971172946);
                z = (iA0d & 14) == 4;
                Object objAaT11 = bfm.AaT();
                if (z || objAaT11 == C78N.A00) {
                    objAaT11 = new HatchArtifactPublishFlowKt$HatchArtifactPublishFlowSheets$11$1(hatchArtifactPublishFlow);
                    bfm.Ai0(objAaT11);
                }
                HatchPublishUnpublishedBottomSheetKt.HatchPublishUnpublishedBottomSheet((Function0) objAaT11, bfm, 0);
            } else {
                if (!(publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view instanceof PublishState.Failed)) {
                    throw AnonymousClass005.A0k(bfm, -971213361);
                }
                bfm.AgE(-41481504);
                boolean zA1Z = AnonymousClass002.A1Z(((PublishState.Failed) publishState$fbandroid_express_aura_java_com_facebook_aura_file_view_view).retryAction, PublishState.RetryAction.UNPUBLISH);
                int i6 = iA0d & 14;
                boolean zA1Q5 = AnonymousClass002.A1Q(i6, 4);
                Object objAaT12 = bfm.AaT();
                if (zA1Q5 || objAaT12 == C78N.A00) {
                    objAaT12 = new HatchArtifactPublishFlowKt$HatchArtifactPublishFlowSheets$12$1(hatchArtifactPublishFlow);
                    bfm.Ai0(objAaT12);
                }
                Function0 function07 = (Function0) objAaT12;
                z = i6 == 4;
                Object objAaT13 = bfm.AaT();
                if (z || objAaT13 == C78N.A00) {
                    objAaT13 = new HatchArtifactPublishFlowKt$HatchArtifactPublishFlowSheets$13$1(hatchArtifactPublishFlow);
                    bfm.Ai0(objAaT13);
                }
                HatchPublishFailedBottomSheetKt.HatchPublishFailedBottomSheet(function07, (Function0) objAaT13, zA1Z, bfm, 0, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass14(hatchArtifactPublishFlow, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.file.view.HatchArtifactPublishFlow rememberHatchArtifactPublishFlow(boolean r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, X.BFM r25, int r26, int r27) {
        /*
            r4 = r22
            r3 = r23
            r2 = r24
            X.AnonymousClass003.A0x(r4, r3)
            r0 = r27 & 8
            if (r0 == 0) goto Lf
            java.lang.String r2 = "FileViewer"
        Lf:
            r5 = r25
            android.content.Context r14 = X.AnonymousClass002.A0H(r5)
            X.CGz r15 = X.AnonymousClass002.A0h(r5)
            java.lang.Object r0 = r5.AaT()
            java.lang.Object r6 = X.C78N.A00
            java.lang.Object r16 = X.AnonymousClass004.A15(r5, r0, r6)
            X.3UX r16 = (X.C3UX) r16
            boolean r0 = r5.A65(r15)
            java.lang.Object r7 = r5.AaT()
            if (r0 != 0) goto L31
            if (r7 != r6) goto L3a
        L31:
            com.facebook.aura.file.repo.ArtifactDeployHolder$Companion r0 = com.facebook.aura.file.repo.ArtifactDeployHolder.Companion
            com.facebook.aura.file.repo.ArtifactDeployHolder r7 = r0.getInstance(r15)
            r5.Ai0(r7)
        L3a:
            com.facebook.aura.file.repo.ArtifactDeployHolder r7 = (com.facebook.aura.file.repo.ArtifactDeployHolder) r7
            r9 = r26
            r0 = r26 & 112(0x70, float:1.57E-43)
            r10 = r0 ^ 48
            r8 = 32
            if (r10 <= r8) goto L4c
            boolean r0 = r5.A65(r4)
            if (r0 != 0) goto L51
        L4c:
            r0 = r26 & 48
            r12 = 0
            if (r0 != r8) goto L52
        L51:
            r12 = 1
        L52:
            r0 = r9 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r11 = 256(0x100, float:3.59E-43)
            if (r0 <= r11) goto L60
            boolean r0 = r5.A65(r3)
            if (r0 != 0) goto L65
        L60:
            r1 = r9 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r11) goto L66
        L65:
            r0 = 1
        L66:
            r12 = r12 | r0
            r0 = r9 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 ^ 3072(0xc00, float:4.305E-42)
            r11 = 2048(0x800, float:2.87E-42)
            if (r0 <= r11) goto L75
            boolean r0 = r5.A65(r2)
            if (r0 != 0) goto L7a
        L75:
            r1 = r9 & 3072(0xc00, float:4.305E-42)
            r0 = 0
            if (r1 != r11) goto L7b
        L7a:
            r0 = 1
        L7b:
            r12 = r12 | r0
            java.lang.Object r13 = r5.AaT()
            if (r12 != 0) goto L84
            if (r13 != r6) goto L94
        L84:
            com.facebook.aura.file.view.HatchArtifactPublishFlow r13 = new com.facebook.aura.file.view.HatchArtifactPublishFlow
            r20 = r2
            r19 = r3
            r18 = r4
            r17 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r5.Ai0(r13)
        L94:
            com.facebook.aura.file.view.HatchArtifactPublishFlow r13 = (com.facebook.aura.file.view.HatchArtifactPublishFlow) r13
            r7 = r21
            r13.setEnabled$fbandroid_express_aura_java_com_facebook_aura_file_view_view(r7)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            r0 = r26 & 14
            r0 = r0 ^ 6
            r1 = 4
            if (r0 <= r1) goto Lac
            boolean r0 = r5.A66(r7)
            if (r0 != 0) goto Lb1
        Lac:
            r0 = r26 & 6
            r2 = 0
            if (r0 != r1) goto Lb2
        Lb1:
            r2 = 1
        Lb2:
            if (r10 <= r8) goto Lba
            boolean r0 = r5.A65(r4)
            if (r0 != 0) goto Lbf
        Lba:
            r1 = r26 & 48
            r0 = 0
            if (r1 != r8) goto Lc0
        Lbf:
            r0 = 1
        Lc0:
            r2 = r2 | r0
            boolean r0 = X.AnonymousClass003.A1O(r5, r15, r13, r2)
            java.lang.Object r9 = r5.AaT()
            if (r0 != 0) goto Lcd
            if (r9 != r6) goto Ld9
        Lcd:
            r14 = 0
            com.facebook.aura.file.view.HatchArtifactPublishFlowKt$rememberHatchArtifactPublishFlow$1$1 r9 = new com.facebook.aura.file.view.HatchArtifactPublishFlowKt$rememberHatchArtifactPublishFlow$1$1
            r11 = r4
            r12 = r15
            r10 = r7
            r9.<init>(r10, r11, r12, r13, r14)
            r5.Ai0(r9)
        Ld9:
            X.AnonymousClass001.A1A(r5, r9, r3, r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.HatchArtifactPublishFlowKt.rememberHatchArtifactPublishFlow(boolean, java.lang.String, java.lang.String, java.lang.String, X.BFM, int, int):com.facebook.aura.file.view.HatchArtifactPublishFlow");
    }
}
