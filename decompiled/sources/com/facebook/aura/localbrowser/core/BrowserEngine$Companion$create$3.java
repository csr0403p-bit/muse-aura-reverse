package com.facebook.aura.localbrowser.core;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.hatch.browser.core.BrowserCore;
import com.hatch.browser.core.BrowserCoreOptions;
import com.hatch.browser.core.BrowserHostBlocklist;
import com.hatch.browser.core.InternalException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngine$Companion$create$3", f = "BrowserEngine.kt", l = {138}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class BrowserEngine$Companion$create$3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super BrowserEngine>, Object> {
    public final /* synthetic */ BrowserHostBlocklist $blocklist;
    public final /* synthetic */ C10543Hqv<BrowserEngine> $engine;
    public final /* synthetic */ G0U<BrowserEngine, Unit> $onShutdown;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BrowserEngine$Companion$create$3(BrowserHostBlocklist browserHostBlocklist, G0U<? super BrowserEngine, Unit> g0u, C10543Hqv<BrowserEngine> c10543Hqv, HtJ<? super BrowserEngine$Companion$create$3> htJ) {
        super(2, htJ);
        this.$blocklist = browserHostBlocklist;
        this.$onShutdown = g0u;
        this.$engine = c10543Hqv;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new BrowserEngine$Companion$create$3(this.$blocklist, this.$onShutdown, this.$engine, htJ);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.facebook.aura.localbrowser.core.BrowserEngine, java.lang.Object] */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        BrowserEngineAuthority browserEngineAuthority;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                if (!BrowserEngineLibrary.INSTANCE.load()) {
                    return null;
                }
                browserEngineAuthority = new BrowserEngineAuthority();
                BrowserCore.Companion companion = BrowserCore.Companion;
                BrowserCoreOptions browserCoreOptions = new BrowserCoreOptions(true, true, browserEngineAuthority, browserEngineAuthority, browserEngineAuthority, browserEngineAuthority.files, browserEngineAuthority, this.$blocklist);
                this.L$0 = browserEngineAuthority;
                this.label = 1;
                obj = companion.create(browserEngineAuthority, browserCoreOptions, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                browserEngineAuthority = (BrowserEngineAuthority) this.L$0;
                Hwg.A00(obj);
            }
            ?? browserEngine = new BrowserEngine((BrowserCore) obj, browserEngineAuthority, this.$onShutdown);
            this.$engine.element = browserEngine;
            return browserEngine;
        } catch (InternalException | LinkageError unused) {
            return null;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super BrowserEngine> htJ) {
        return ((BrowserEngine$Companion$create$3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
