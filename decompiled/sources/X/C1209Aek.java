package X;

import androidx.compose.runtime.MutableState;

/* renamed from: X.Aek, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1209Aek implements InterfaceC1211Aem, InterfaceC1210Ael, A4B {
    public int A01;
    public InterfaceC1211Aem A02;
    public boolean A03;
    public final Object A05;
    public final A4A A06;
    public int A00 = -1;
    public final MutableState A04 = AbstractC1798ArH.A03();

    @Override // X.InterfaceC1210Ael
    public final C1209Aek AXt() {
        if (this.A03) {
            throw C3cG.A0Q("Pin should not be called on an already disposed item ");
        }
        if (this.A01 == 0) {
            this.A06.A00.add(this);
            InterfaceC1210Ael interfaceC1210Ael = (InterfaceC1210Ael) this.A04.getValue();
            this.A02 = interfaceC1210Ael != null ? interfaceC1210Ael.AXt() : null;
        }
        this.A01++;
        return this;
    }

    @Override // X.InterfaceC1211Aem
    public final void release() {
        if (this.A03) {
            return;
        }
        int i = this.A01;
        if (i <= 0) {
            throw C3cG.A0Q("Release should only be called once");
        }
        int i2 = i - 1;
        this.A01 = i2;
        if (i2 == 0) {
            this.A06.A00.remove(this);
            InterfaceC1211Aem interfaceC1211Aem = this.A02;
            if (interfaceC1211Aem != null) {
                interfaceC1211Aem.release();
            }
            this.A02 = null;
        }
    }

    public C1209Aek(A4A a4a, Object obj) {
        this.A05 = obj;
        this.A06 = a4a;
    }
}
