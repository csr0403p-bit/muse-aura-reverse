package X;

import android.content.Context;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public abstract class EDU extends EDV {
    public static final AtomicInteger caskCreationCounter = BV5.A17();
    public InterfaceC6539EDu caskPluginMapper;
    public InterfaceC3421CMj defaultRegistryCreator;
    public InterfaceC6544EDz superstoreConstraintsProvider;

    @Override // X.EDV
    public File get(C3380CIk c3380CIk, C6537EDs c6537EDs) {
        C7384Etj.A0Y(c3380CIk, 0);
        return getAppNonScoped_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV(c3380CIk.A00, c6537EDs);
    }

    public String getScopeIdentifier() {
        return null;
    }

    @Override // X.EDV
    public InterfaceC3421CMj getStorageRegistryPathFactory() {
        InterfaceC3421CMj interfaceC3421CMj = this.defaultRegistryCreator;
        if (interfaceC3421CMj != null) {
            return interfaceC3421CMj;
        }
        C7384Etj.A0b("defaultRegistryCreator");
        throw F60.createAndThrow();
    }

    @Override // X.EDV
    public File getAppNonScoped_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV(int i, C6537EDs c6537EDs) {
        String strA01 = AbstractC6540EDv.A01(i);
        int iIncrementAndGet = caskCreationCounter.incrementAndGet();
        BV4.A0D().markerStart(38478381, iIncrementAndGet);
        BV4.A0D().markerAnnotate(38478381, iIncrementAndGet, "feature", strA01);
        logCacheConfigAnnotations(iIncrementAndGet, c6537EDs, 38478381);
        try {
            BV4.A0D().markerPoint(38478381, iIncrementAndGet, "get_path_non_scoped_start");
            File appNonScoped_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV = super.getAppNonScoped_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV(i, c6537EDs);
            EDV.A00(BV4.A0D(), "get_path_non_scoped_end", 38478381, iIncrementAndGet).markerPoint(38478381, iIncrementAndGet, "path_config_creation_non_scoped_start");
            InterfaceC6544EDz interfaceC6544EDz = this.superstoreConstraintsProvider;
            if (interfaceC6544EDz == null) {
                C7384Etj.A0b("superstoreConstraintsProvider");
            } else {
                EDW edw = new EDW(c6537EDs, interfaceC6544EDz, i);
                EDV.A00(BV4.A0D(), "path_config_creation_non_scoped_end", 38478381, iIncrementAndGet).markerPoint(38478381, iIncrementAndGet, "register_path_non_scoped_start");
                InterfaceC6539EDu interfaceC6539EDu = this.caskPluginMapper;
                if (interfaceC6539EDu != null) {
                    AbstractC6530EDc.A00(interfaceC6539EDu, edw, appNonScoped_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV);
                    BV4.A0D().markerPoint(38478381, iIncrementAndGet, "register_path_non_scoped_end");
                    BV4.A0D().markerEnd(38478381, iIncrementAndGet, (short) 2);
                    return appNonScoped_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV;
                }
                C7384Etj.A0b("caskPluginMapper");
            }
            throw F60.createAndThrow();
        } catch (Throwable th) {
            BV4.A0D().markerEnd(38478381, iIncrementAndGet, (short) 3);
            throw th;
        }
    }

    public final void init(Context context, InterfaceC6539EDu interfaceC6539EDu) {
        AnonymousClass003.A0u(context, interfaceC6539EDu);
        init(context, interfaceC6539EDu, new C6541EDw());
    }

    @Override // X.EDV
    public File get(int i, BXe bXe, C6537EDs c6537EDs) {
        C7384Etj.A0Y(bXe, 1);
        String strA01 = AbstractC6540EDv.A01(i);
        int iIncrementAndGet = caskCreationCounter.incrementAndGet();
        BV4.A0D().markerStart(38478381, iIncrementAndGet);
        BV4.A0D().markerAnnotate(38478381, iIncrementAndGet, "feature", strA01);
        logCacheConfigAnnotations(iIncrementAndGet, c6537EDs, 38478381);
        try {
            BV4.A0D().markerPoint(38478381, iIncrementAndGet, "get_path_scoped_start");
            File file = super.get(i, bXe, c6537EDs);
            EDV.A00(BV4.A0D(), "get_path_scoped_end", 38478381, iIncrementAndGet).markerPoint(38478381, iIncrementAndGet, "path_config_creation_scoped_start");
            InterfaceC6544EDz interfaceC6544EDz = this.superstoreConstraintsProvider;
            if (interfaceC6544EDz == null) {
                C7384Etj.A0b("superstoreConstraintsProvider");
            } else {
                EDW edw = new EDW(c6537EDs, interfaceC6544EDz, i);
                edw.A00 = bXe;
                EDV.A00(BV4.A0D(), "path_config_creation_scoped_end", 38478381, iIncrementAndGet).markerPoint(38478381, iIncrementAndGet, "register_path_scoped_start");
                InterfaceC6539EDu interfaceC6539EDu = this.caskPluginMapper;
                if (interfaceC6539EDu == null) {
                    C7384Etj.A0b("caskPluginMapper");
                } else {
                    AbstractC6530EDc.A00(interfaceC6539EDu, edw, file);
                    BV4.A0D().markerPoint(38478381, iIncrementAndGet, "register_path_scoped_end");
                    BV4.A0D().markerEnd(38478381, iIncrementAndGet, (short) 2);
                    return file;
                }
            }
            throw F60.createAndThrow();
        } catch (Throwable th) {
            BV4.A0D().markerEnd(38478381, iIncrementAndGet, (short) 3);
            throw th;
        }
    }

    public final void init(Context context, InterfaceC6539EDu interfaceC6539EDu, InterfaceC6544EDz interfaceC6544EDz) {
        C3417CMf c3417CMf;
        AnonymousClass005.A0x(context, interfaceC6539EDu, interfaceC6544EDz);
        synchronized (C3417CMf.A04) {
            c3417CMf = C3417CMf.A03;
            if (c3417CMf == null) {
                c3417CMf = new C3417CMf(context);
                C3417CMf.A03 = c3417CMf;
            }
            C7384Etj.A0X(c3417CMf);
        }
        this.defaultRegistryCreator = c3417CMf;
        this.caskPluginMapper = interfaceC6539EDu;
        this.superstoreConstraintsProvider = interfaceC6544EDz;
    }

    @Override // X.EDV
    public File get(EDP edp, BXe bXe, C6537EDs c6537EDs) {
        AnonymousClass003.A0u(edp, bXe);
        return get(edp.A00, bXe, c6537EDs);
    }
}
