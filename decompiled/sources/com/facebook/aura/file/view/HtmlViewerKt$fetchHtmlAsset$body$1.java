package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchFileOperations;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.HtmlViewerKt$fetchHtmlAsset$body$1", f = "HtmlViewer.kt", l = {870}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HtmlViewerKt$fetchHtmlAsset$body$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super InputStream>, Object> {
    public final /* synthetic */ String $path;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.file.view.HtmlViewerKt$fetchHtmlAsset$body$1$1", f = "HtmlViewer.kt", l = {871}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.HtmlViewerKt$fetchHtmlAsset$body$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super InputStream>, Object> {
        public final /* synthetic */ String $path;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$path = str;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$path, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                String str = this.$path;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                Long lA0S = C3cG.A0S(10L);
                this.label = 1;
                obj = hatchFileOperations.openMediaStream(str, abstractC3358CGz, lA0S, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super InputStream> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlViewerKt$fetchHtmlAsset$body$1(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super HtmlViewerKt$fetchHtmlAsset$body$1> htJ) {
        super(2, htJ);
        this.$path = str;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HtmlViewerKt$fetchHtmlAsset$body$1(this.$path, this.$userSession, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$path, this.$userSession, null);
            this.label = 1;
            obj = GAX.A00(this, anonymousClass1, 10000L);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super InputStream> htJ) {
        return ((HtmlViewerKt$fetchHtmlAsset$body$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
