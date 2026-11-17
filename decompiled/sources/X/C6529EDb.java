package X;

import java.util.Comparator;
import kotlin.Deprecated;

@Deprecated(message = "")
/* renamed from: X.EDb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6529EDb implements InterfaceC6539EDu {
    public C3419CMh A00;
    public InterfaceC6539EDu A01;
    public Comparator A02;

    @Override // X.InterfaceC6539EDu
    public final InterfaceC6536EDr<EE9> controllerForPlugin(EE9 ee9) {
        C7384Etj.A0Y(ee9, 0);
        InterfaceC6539EDu interfaceC6539EDu = this.A01;
        if (interfaceC6539EDu != null) {
            return interfaceC6539EDu.controllerForPlugin(ee9);
        }
        C7384Etj.A0b("caskPluginMapper");
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC6539EDu
    public final void onUnhandledPlugin(EDW edw, EE9 ee9) {
        C7384Etj.A0Y(ee9, 1);
        InterfaceC6539EDu interfaceC6539EDu = this.A01;
        if (interfaceC6539EDu == null) {
            C7384Etj.A0b("caskPluginMapper");
            throw F60.createAndThrow();
        }
        interfaceC6539EDu.onUnhandledPlugin(edw, ee9);
    }
}
