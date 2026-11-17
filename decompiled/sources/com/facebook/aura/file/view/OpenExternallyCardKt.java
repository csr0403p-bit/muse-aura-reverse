package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0V;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.file.actions.HatchFileActions;
import com.facebook.aura.file.actions.HatchFileRef;
import com.facebook.aura.file.view.ExternalFileSource;
import com.facebook.aura.model.HatchFileProviderUtil;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class OpenExternallyCardKt {

    /* renamed from: com.facebook.aura.file.view.OpenExternallyCardKt$OpenExternallyCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ File $file;
        public final /* synthetic */ String $message;
        public final /* synthetic */ String $mimeType;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(File file, String str, BRg bRg, String str2, int i, int i2) {
            super(2);
            this.$file = file;
            this.$mimeType = str;
            this.$modifier = bRg;
            this.$message = str2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            OpenExternallyCardKt.OpenExternallyCard(this.$file, this.$mimeType, this.$modifier, this.$message, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.OpenExternallyCardKt$OpenExternallyCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $message;
        public final /* synthetic */ String $mimeType;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ExternalFileSource $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ExternalFileSource externalFileSource, String str, BRg bRg, String str2, int i, int i2) {
            super(2);
            this.$source = externalFileSource;
            this.$mimeType = str;
            this.$modifier = bRg;
            this.$message = str2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            OpenExternallyCardKt.OpenExternallyCard(this.$source, this.$mimeType, this.$modifier, this.$message, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OpenExternallyCard(com.facebook.aura.file.view.ExternalFileSource r16, java.lang.String r17, X.BRg r18, java.lang.String r19, X.BFM r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.OpenExternallyCardKt.OpenExternallyCard(com.facebook.aura.file.view.ExternalFileSource, java.lang.String, X.BRg, java.lang.String, X.BFM, int, int):void");
    }

    public static final boolean launchOpenWith(Context context, ExternalFileSource externalFileSource, String str) {
        if (externalFileSource instanceof ExternalFileSource.Local) {
            return HatchFileActions.INSTANCE.openExternally(context, ((ExternalFileSource.Local) externalFileSource).ref, str);
        }
        if (!(externalFileSource instanceof ExternalFileSource.Staged)) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            ExternalFileSource.Staged staged = (ExternalFileSource.Staged) externalFileSource;
            Uri uriForFile = HatchFileProviderUtil.INSTANCE.getUriForFile(context, staged.file);
            if (uriForFile == null) {
                return false;
            }
            HatchFileActions hatchFileActions = HatchFileActions.INSTANCE;
            String name = staged.file.getName();
            C7384Etj.A0U(name);
            return hatchFileActions.openExternally(context, new HatchFileRef.Local(uriForFile, name), str);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OpenExternallyCard(java.io.File r10, java.lang.String r11, X.BRg r12, java.lang.String r13, X.BFM r14, int r15, int r16) {
        /*
            r4 = r11
            r5 = r12
            r6 = r13
            boolean r9 = X.AnonymousClass004.A1b(r10, r11)
            r0 = 772684466(0x2e0e3ab2, float:3.2339194E-11)
            r7 = r14
            r14.AgG(r0)
            r14 = r15
            r0 = r15 & 6
            if (r0 != 0) goto L97
            int r1 = X.AnonymousClass004.A0T(r7, r10)
            r1 = r1 | r15
        L18:
            r0 = r15 & 48
            if (r0 != 0) goto L21
            int r0 = X.AnonymousClass004.A0e(r7, r11)
            r1 = r1 | r0
        L21:
            r15 = r16
            r3 = r16 & 4
            if (r3 == 0) goto L8d
            r1 = r1 | 384(0x180, float:5.38E-43)
        L29:
            r0 = r14 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L3c
            r0 = r16 & 8
            if (r0 != 0) goto L39
            boolean r2 = r7.A65(r13)
            r0 = 2048(0x800, float:2.87E-42)
            if (r2 != 0) goto L3b
        L39:
            r0 = 1024(0x400, float:1.435E-42)
        L3b:
            r1 = r1 | r0
        L3c:
            boolean r0 = X.AnonymousClass004.A1L(r1)
            boolean r0 = X.AnonymousClass001.A1b(r0, r7, r1)
            if (r0 == 0) goto L89
            r7.Afy()
            r0 = r14 & 1
            if (r0 == 0) goto L79
            boolean r0 = r7.AEk()
            if (r0 != 0) goto L79
            r7.Afo()
            r0 = r16 & 8
            if (r0 == 0) goto L5c
        L5a:
            r1 = r1 & (-7169(0xffffffffffffe3ff, float:NaN))
        L5c:
            r7.AAb()
            com.facebook.aura.file.view.ExternalFileSource$Staged r3 = new com.facebook.aura.file.view.ExternalFileSource$Staged
            r3.<init>(r10)
            r8 = r1 & 8176(0x1ff0, float:1.1457E-41)
            OpenExternallyCard(r3, r4, r5, r6, r7, r8, r9)
        L69:
            X.BBb r0 = r7.AAc()
            if (r0 == 0) goto L78
            com.facebook.aura.file.view.OpenExternallyCardKt$OpenExternallyCard$1 r9 = new com.facebook.aura.file.view.OpenExternallyCardKt$OpenExternallyCard$1
            r12 = r5
            r13 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.A06 = r9
        L78:
            return
        L79:
            if (r3 == 0) goto L7d
            X.BS0 r5 = X.BRg.A00
        L7d:
            r0 = r16 & 8
            if (r0 == 0) goto L5c
            r0 = 2131888622(0x7f1209ee, float:1.9411885E38)
            java.lang.String r6 = X.AbstractC2271BQs.A01(r7, r0)
            goto L5a
        L89:
            r7.Afo()
            goto L69
        L8d:
            r0 = r14 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L29
            int r0 = X.AnonymousClass004.A0f(r7, r12)
            r1 = r1 | r0
            goto L29
        L97:
            r1 = r15
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.OpenExternallyCardKt.OpenExternallyCard(java.io.File, java.lang.String, X.BRg, java.lang.String, X.BFM, int, int):void");
    }
}
