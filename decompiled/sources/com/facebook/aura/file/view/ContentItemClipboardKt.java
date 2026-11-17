package com.facebook.aura.file.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.file.view.api.ContentItem;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ContentItemClipboardKt {

    @DebugMetadata(c = "com.facebook.aura.file.view.ContentItemClipboardKt", f = "ContentItemClipboard.kt", l = {26, 33, 40}, m = "copyContentItemToClipboard", v = 2)
    /* renamed from: com.facebook.aura.file.view.ContentItemClipboardKt$copyContentItemToClipboard$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentItemClipboardKt.copyContentItemToClipboard(null, null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* renamed from: com.facebook.aura.file.view.ContentItemClipboardKt$copyContentItemToClipboard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object copyContentItemToClipboard(android.content.Context r12, X.AbstractC3358CGz r13, com.facebook.aura.file.view.api.ContentItem r14, kotlin.jvm.functions.Function0<java.lang.Boolean> r15, X.HtJ<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.ContentItemClipboardKt.copyContentItemToClipboard(android.content.Context, X.CGz, com.facebook.aura.file.view.api.ContentItem, kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object copyContentItemToClipboard$default(Context context, AbstractC3358CGz abstractC3358CGz, ContentItem contentItem, Function0 function0, HtJ htJ, int i, Object obj) {
        if ((i & 8) != 0) {
            function0 = AnonymousClass2.INSTANCE;
        }
        return copyContentItemToClipboard(context, abstractC3358CGz, contentItem, function0, htJ);
    }
}
