package X;

import java.io.File;
import java.io.Writer;
import java.util.ArrayList;

/* renamed from: X.CHg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3362CHg implements InterfaceC3367CHl {
    public final InterfaceC3367CHl A00;
    public final C3365CHj A01;

    @Override // X.InterfaceC3363CHh
    public final int AFK() {
        return this.A00.AFK();
    }

    @Override // X.InterfaceC3367CHl
    public final boolean ANC() {
        return this.A00.ANC();
    }

    @Override // X.InterfaceC3363CHh
    public final boolean AOm() {
        return this.A00.AOm();
    }

    @Override // X.InterfaceC3363CHh
    public final void AQ9() {
        File file;
        boolean zEquals;
        this.A00.AQ9();
        C3365CHj c3365CHj = this.A01;
        String strValueOf = String.valueOf(C3364CHi.A00());
        String strValueOf2 = String.valueOf(C3364CHi.A01());
        ArrayList<AbstractC3371CHp> arrayList = c3365CHj.A00;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC3371CHp abstractC3371CHp = arrayList.get(i);
            if (abstractC3371CHp instanceof C3376CHv) {
                file = ((AbstractC3372CHq) abstractC3371CHp).A00;
                zEquals = file.getName().equals(strValueOf2);
            } else {
                boolean z = abstractC3371CHp instanceof C3370CHo;
                file = ((AbstractC3372CHq) abstractC3371CHp).A00;
                if (z) {
                    zEquals = file.getName().equals(strValueOf);
                }
                C3361CHf.A00(file);
            }
            if (!zEquals) {
                C3361CHf.A00(file);
            }
        }
        arrayList.clear();
    }

    @Override // X.InterfaceC3363CHh
    public final boolean AfZ() {
        return this.A00.AfZ();
    }

    @Override // X.InterfaceC3363CHh
    public final void Ais(Writer writer) {
        this.A00.Ais(writer);
    }

    @Override // X.InterfaceC3363CHh
    public final String getFFDBToken() {
        return this.A00.getFFDBToken();
    }

    @Override // X.InterfaceC3367CHl
    public final void unlock() {
        this.A00.unlock();
    }

    public C3362CHg(InterfaceC3367CHl interfaceC3367CHl, C3365CHj c3365CHj) {
        this.A00 = interfaceC3367CHl;
        this.A01 = c3365CHj;
    }
}
