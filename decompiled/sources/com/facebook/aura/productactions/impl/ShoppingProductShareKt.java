package com.facebook.aura.productactions.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public abstract class ShoppingProductShareKt {

    @DebugMetadata(c = "com.facebook.aura.productactions.impl.ShoppingProductShareKt", f = "ShoppingProductShare.kt", l = {HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX, 103, 124}, m = "prepareProductShare", v = 2)
    /* renamed from: com.facebook.aura.productactions.impl.ShoppingProductShareKt$prepareProductShare$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ShoppingProductShareKt.prepareProductShare(null, null, null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.productactions.impl.ShoppingProductShareKt$prepareProductShare$2", f = "ShoppingProductShare.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.productactions.impl.ShoppingProductShareKt$prepareProductShare$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ C10543Hqv<File> $thumbnailFile;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C10543Hqv<File> c10543Hqv, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$thumbnailFile = c10543Hqv;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$thumbnailFile, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            File file = this.$thumbnailFile.element;
            if (file != null) {
                return Boolean.valueOf(file.delete());
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return new AnonymousClass2(this.$thumbnailFile, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0 A[Catch: Exception -> 0x0112, TryCatch #12 {Exception -> 0x0112, blocks: (B:47:0x00bd, B:48:0x00c0, B:49:0x00ca, B:51:0x00d0, B:56:0x00db, B:58:0x00e1, B:60:0x00e8, B:61:0x00f2, B:63:0x00fa, B:64:0x00ff), top: B:85:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1 A[Catch: Exception -> 0x0112, TryCatch #12 {Exception -> 0x0112, blocks: (B:47:0x00bd, B:48:0x00c0, B:49:0x00ca, B:51:0x00d0, B:56:0x00db, B:58:0x00e1, B:60:0x00e8, B:61:0x00f2, B:63:0x00fa, B:64:0x00ff), top: B:85:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8 A[Catch: Exception -> 0x0112, TryCatch #12 {Exception -> 0x0112, blocks: (B:47:0x00bd, B:48:0x00c0, B:49:0x00ca, B:51:0x00d0, B:56:0x00db, B:58:0x00e1, B:60:0x00e8, B:61:0x00f2, B:63:0x00fa, B:64:0x00ff), top: B:85:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fa A[Catch: Exception -> 0x0112, TryCatch #12 {Exception -> 0x0112, blocks: (B:47:0x00bd, B:48:0x00c0, B:49:0x00ca, B:51:0x00d0, B:56:0x00db, B:58:0x00e1, B:60:0x00e8, B:61:0x00f2, B:63:0x00fa, B:64:0x00ff), top: B:85:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object prepareProductShare(android.content.Context r15, X.AbstractC3358CGz r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, X.HtJ<? super com.facebook.aura.productactions.impl.PreparedProductShare> r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.productactions.impl.ShoppingProductShareKt.prepareProductShare(android.content.Context, X.CGz, java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }
}
