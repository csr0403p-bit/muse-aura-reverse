package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DM;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ContentPreviewKt {

    /* renamed from: com.facebook.aura.file.view.ContentPreviewKt$ContentPreview$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C1DM $clipShape;
        public final /* synthetic */ String $fileExtension;
        public final /* synthetic */ String $imageUri;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ String $sharedElementKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, String str2, String str3, BRg bRg, String str4, C1DM c1dm, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$relativePath = str;
            this.$fileExtension = str2;
            this.$imageUri = str3;
            this.$modifier = bRg;
            this.$sharedElementKey = str4;
            this.$clipShape = c1dm;
            this.$onClick = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ContentPreviewKt.ContentPreview(this.$relativePath, this.$fileExtension, this.$imageUri, this.$modifier, this.$sharedElementKey, this.$clipShape, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContentPreview(java.lang.String r19, java.lang.String r20, java.lang.String r21, X.BRg r22, java.lang.String r23, X.C1DM r24, kotlin.jvm.functions.Function0<kotlin.Unit> r25, X.BFM r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.ContentPreviewKt.ContentPreview(java.lang.String, java.lang.String, java.lang.String, X.BRg, java.lang.String, X.1DM, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }
}
