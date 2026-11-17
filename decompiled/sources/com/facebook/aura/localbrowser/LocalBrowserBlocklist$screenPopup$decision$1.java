package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.localbrowser.core.BrowserEngine;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserBlocklist$screenPopup$decision$1", f = "LocalBrowserBlocklist.kt", l = {150}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class LocalBrowserBlocklist$screenPopup$decision$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super byte[]>, Object> {
    public final /* synthetic */ BrowserEngine $engine;
    public final /* synthetic */ String $url;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserBlocklist$screenPopup$decision$1$1", f = "LocalBrowserBlocklist.kt", l = {150}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserBlocklist$screenPopup$decision$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super byte[]>, Object> {
        public final /* synthetic */ BrowserEngine $engine;
        public final /* synthetic */ String $url;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BrowserEngine browserEngine, String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$engine = browserEngine;
            this.$url = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$engine, this.$url, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BrowserEngine browserEngine = this.$engine;
                String str = this.$url;
                this.label = 1;
                obj = browserEngine.screenNavigation(str, true, this);
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
        public final Object invoke(C3UX c3ux, HtJ<? super byte[]> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserBlocklist$screenPopup$decision$1(BrowserEngine browserEngine, String str, HtJ<? super LocalBrowserBlocklist$screenPopup$decision$1> htJ) {
        super(2, htJ);
        this.$engine = browserEngine;
        this.$url = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserBlocklist$screenPopup$decision$1(this.$engine, this.$url, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$engine, this.$url, null);
            this.label = 1;
            obj = GAX.A01(this, anonymousClass1, 6000L);
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
    public final Object invoke(C3UX c3ux, HtJ<? super byte[]> htJ) {
        return ((LocalBrowserBlocklist$screenPopup$decision$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
