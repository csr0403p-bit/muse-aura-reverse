package com.facebook.aura.file.view;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0953AJg;
import X.C0KA;
import X.C7384Etj;
import X.InterfaceC0962AJp;

/* loaded from: classes.dex */
public final class SlideState extends C06G {
    public final int editingIndex;
    public final InterfaceC0962AJp<Integer, String> htmlCache;
    public final boolean isLoading;

    public SlideState(InterfaceC0962AJp<Integer, String> interfaceC0962AJp, boolean z, int i) {
        C7384Etj.A0Y(interfaceC0962AJp, 0);
        this.htmlCache = interfaceC0962AJp;
        this.isLoading = z;
        this.editingIndex = i;
    }

    public final SlideState copy(InterfaceC0962AJp<Integer, String> interfaceC0962AJp, boolean z, int i) {
        C7384Etj.A0Y(interfaceC0962AJp, 0);
        return new SlideState(interfaceC0962AJp, z, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SlideState) {
                SlideState slideState = (SlideState) obj;
                if (!C7384Etj.areEqual(this.htmlCache, slideState.htmlCache) || this.isLoading != slideState.isLoading || this.editingIndex != slideState.editingIndex) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SlideState copy$default(SlideState slideState, InterfaceC0962AJp interfaceC0962AJp, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC0962AJp = slideState.htmlCache;
        }
        if ((i2 & 2) != 0) {
            z = slideState.isLoading;
        }
        if ((i2 & 4) != 0) {
            i = slideState.editingIndex;
        }
        return slideState.copy(interfaceC0962AJp, z, i);
    }

    public final InterfaceC0962AJp<Integer, String> component1() {
        return this.htmlCache;
    }

    public final boolean component2() {
        return this.isLoading;
    }

    public final int component3() {
        return this.editingIndex;
    }

    public final int getEditingIndex() {
        return this.editingIndex;
    }

    public final InterfaceC0962AJp<Integer, String> getHtmlCache() {
        return this.htmlCache;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass005.A0E(this.htmlCache), this.isLoading) + this.editingIndex;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SlideState(InterfaceC0962AJp interfaceC0962AJp, boolean z, int i, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? C0953AJg.A00() : interfaceC0962AJp, AnonymousClass001.A1Q(i2, z), (i2 & 4) != 0 ? 0 : i);
    }

    public SlideState() {
        this(C0953AJg.A00(), false, 0);
    }
}
