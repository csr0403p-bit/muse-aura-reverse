package com.facebook.aura.nodes.datasource;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C3UX;
import X.C60O;
import X.C7384Etj;
import X.G0U;
import X.HoC;
import X.HtJ;
import X.HzP;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ContentObserverHost implements TriggerHost {
    public final Context context;
    public volatile HoC debounceJob;
    public final long debounceMs;
    public final boolean notifyForDescendants;
    public volatile ContentObserver observer;
    public final G0U<HtJ<? super Unit>, Object> onChange;
    public final C3UX scope;
    public final Uri uri;

    @DebugMetadata(c = "com.facebook.aura.nodes.datasource.ContentObserverHost", f = "HatchProactiveTriggerManager.kt", l = {160}, m = "runOnChange", v = 2)
    /* renamed from: com.facebook.aura.nodes.datasource.ContentObserverHost$runOnChange$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentObserverHost.this.runOnChange(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runOnChange(X.HtJ<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.nodes.datasource.ContentObserverHost.AnonymousClass1
            if (r0 == 0) goto L1e
            r4 = r6
            com.facebook.aura.nodes.datasource.ContentObserverHost$runOnChange$1 r4 = (com.facebook.aura.nodes.datasource.ContentObserverHost.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L28
            goto L24
        L1e:
            com.facebook.aura.nodes.datasource.ContentObserverHost$runOnChange$1 r4 = new com.facebook.aura.nodes.datasource.ContentObserverHost$runOnChange$1
            r4.<init>(r6)
            goto L12
        L24:
            X.Hwg.A00(r3)     // Catch: java.lang.Exception -> L3b
            goto L4b
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r3)
            X.G0U<X.HtJ<? super kotlin.Unit>, java.lang.Object> r0 = r5.onChange     // Catch: java.lang.Exception -> L3b
            r4.label = r1     // Catch: java.lang.Exception -> L3b
            java.lang.Object r0 = r0.invoke(r4)     // Catch: java.lang.Exception -> L3b
            if (r0 != r2) goto L4b
            return r2
        L3b:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "ContentObserver onChange handler failed: "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "HatchProactiveTriggerManager"
            X.CFK.A0A(r0, r1, r2)
        L4b:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.datasource.ContentObserverHost.runOnChange(X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.datasource.TriggerHost
    public void stop() {
        HoC hoC = this.debounceJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.debounceJob = null;
        ContentObserver contentObserver = this.observer;
        if (contentObserver != null) {
            this.context.getContentResolver().unregisterContentObserver(contentObserver);
        }
        this.observer = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentObserverHost(Context context, C3UX c3ux, Uri uri, boolean z, long j, G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
        AnonymousClass005.A0x(context, c3ux, uri);
        C7384Etj.A0Y(g0u, 5);
        this.context = context;
        this.scope = c3ux;
        this.uri = uri;
        this.notifyForDescendants = z;
        this.debounceMs = j;
        this.onChange = g0u;
    }

    @Override // com.facebook.aura.nodes.datasource.TriggerHost
    public void start() {
        final Handler handlerA02 = C60O.A02();
        ContentObserver contentObserver = new ContentObserver(handlerA02) { // from class: com.facebook.aura.nodes.datasource.ContentObserverHost$start$obs$1
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                ContentObserverHost contentObserverHost = this;
                if (contentObserverHost.debounceMs <= 0) {
                    AnonymousClass001.A1J(new ContentObserverHost$start$obs$1$onChange$1(contentObserverHost, null), contentObserverHost.scope);
                    return;
                }
                HoC hoC = contentObserverHost.debounceJob;
                if (hoC != null) {
                    hoC.A5w(null);
                }
                ContentObserverHost contentObserverHost2 = this;
                contentObserverHost2.debounceJob = AnonymousClass001.A11(new ContentObserverHost$start$obs$1$onChange$2(contentObserverHost2, null), contentObserverHost2.scope);
            }
        };
        this.observer = contentObserver;
        this.context.getContentResolver().registerContentObserver(this.uri, this.notifyForDescendants, contentObserver);
    }
}
