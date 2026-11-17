package X;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: X.Cfg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3851Cfg implements Closeable {
    public F18<AbstractC3769CeC> A00;
    public F18 A01;
    public F18<C3857Cfm> A02;
    public F18<Executor> A03;
    public F18 A04;
    public F18<String> A05;
    public F18<C3842CfV> A06;
    public F18 A07;
    public F18<Context> A08;
    public F18<C3847Cfc> A09;
    public F18<C3856Cfl> A0A;
    public F18<C3881CgI> A0B;
    public F18<InterfaceC3899Cgd> A0C;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A06.AMN().close();
    }
}
