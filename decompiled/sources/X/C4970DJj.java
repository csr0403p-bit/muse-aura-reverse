package X;

import android.content.Context;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.hyperthrift.HyperThriftBase;
import com.facebook.logginginfra.falco.Checksum;
import com.facebook.logginginfra.falco.GetQPLConfigDirective;
import com.facebook.logginginfra.falco.Identity;
import com.facebook.logginginfra.falco.PrincipalSubject;
import com.facebook.logginginfra.falco.SetQPLConfigDirective;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.DJj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4970DJj implements DHQ {
    public final DJm A00;
    public final F18<C4972DJl> A01;

    @Override // X.DHQ
    public final GetQPLConfigDirective getQPLConfigDirective(PrincipalSubject principalSubject) {
        Checksum checksum;
        Object[] objArr = new Object[3];
        Object obj = principalSubject;
        if (principalSubject == null) {
            obj = HyperThriftBase.A02;
        }
        objArr[0] = obj;
        objArr[1] = "v1";
        Identity identity = (Identity) principalSubject.A00(3);
        C4972DJl c4972DJlAMN = this.A01.AMN();
        if (identity != null && c4972DJlAMN != null) {
            C4971DJk c4971DJk = c4972DJlAMN.A05.get();
            if (c4971DJk == null || !C4972DJl.A01(identity, c4971DJk.A01)) {
                try {
                    try {
                        C4971DJk c4971DJkA00 = C4971DJk.A00(c4972DJlAMN.A02, identity, (C14) c4972DJlAMN.A06.AMN(), c4972DJlAMN.A04, null);
                        if (c4971DJkA00 != null) {
                            checksum = c4971DJkA00.A00;
                        }
                    } catch (IOException e) {
                        CFK.A0A("QPLConfig", "failed to load config", e);
                    }
                } catch (Exception unused) {
                    c4972DJlAMN.A07.AMN();
                }
            } else {
                checksum = c4971DJk.A00;
            }
            objArr[2] = checksum;
        }
        Object[] objArr2 = new Object[3];
        System.arraycopy(objArr, 0, objArr2, 0, 3);
        GetQPLConfigDirective getQPLConfigDirective = new GetQPLConfigDirective();
        getQPLConfigDirective.A00 = "com.facebook.logginginfra.falco.GetQPLConfigDirective";
        getQPLConfigDirective.A01 = objArr2;
        return getQPLConfigDirective;
    }

    @Override // X.DHQ
    public final boolean handleConfig(SetQPLConfigDirective setQPLConfigDirective) throws IllegalAccessException, NoSuchAlgorithmException, IOException, IllegalArgumentException, InvocationTargetException {
        File fileA00;
        File fileA0O;
        Object objA00 = setQPLConfigDirective.A00(3);
        if (objA00 == null) {
            objA00 = null;
        }
        if (objA00 != null) {
            F18<C4972DJl> f18 = this.A01;
            C4971DJk c4971DJk = f18.AMN().A05.get();
            Checksum checksum = c4971DJk == null ? null : c4971DJk.A00;
            if (checksum == null || !checksum.equals(objA00)) {
                C4971DJk c4971DJkA00 = this.A00.A00(setQPLConfigDirective);
                if (c4971DJkA00 != null) {
                    C4972DJl c4972DJlAMN = f18.AMN();
                    Identity identity = c4972DJlAMN.A00.get();
                    Identity identity2 = c4971DJkA00.A01;
                    if (C4972DJl.A01(identity, identity2)) {
                        c4972DJlAMN.A05.set(c4971DJkA00);
                        try {
                            C4972DJl.A00(c4972DJlAMN);
                        } catch (Exception unused) {
                            c4972DJlAMN.A07.AMN();
                        }
                    }
                    AwakeTimeSinceBootClock awakeTimeSinceBootClock = c4972DJlAMN.A01;
                    awakeTimeSinceBootClock.nowNanos();
                    C14 c14 = (C14) c4972DJlAMN.A06.AMN();
                    DKG dkg = c4972DJlAMN.A02;
                    String strA01 = C4971DJk.A01(identity2);
                    try {
                        Context context = c14.A00;
                        AnonymousClass003.A0u(context, DK6.A00);
                        fileA00 = AbstractC3416CMe.A00(context, 1045170971);
                        fileA00.mkdirs();
                        fileA0O = C3cG.A0O(fileA00, String.format(Locale.US, "qpl_sampling_config_v2_%s.tmp", Arrays.copyOf(new Object[]{strA01}, 1)));
                    } catch (IOException e) {
                        CFK.A0A("QPLConfig", "failed to save qpl config", e);
                    }
                    if (!fileA00.exists() && !fileA00.mkdirs()) {
                        throw BV4.A0K("Failed to create storage dir");
                    }
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new C13(fileA0O, fileA00, strA01)));
                    try {
                        objectOutputStream.writeInt(1);
                        C5090DVl c5090DVl = new C5090DVl();
                        c5090DVl.A00 = null;
                        c5090DVl.A01 = objectOutputStream;
                        DVW.A00(setQPLConfigDirective, new DVW(dkg.A00, new C5081DVa(c5090DVl, -1L, -1L)), "com.facebook.logginginfra.falco.SetQPLConfigDirective");
                        objectOutputStream.close();
                        awakeTimeSinceBootClock.nowNanos();
                        c4971DJkA00.A04.A00.size();
                        DK2 dk2 = c4971DJkA00.A03.A00;
                        if (dk2 != null) {
                            dk2.size();
                            return true;
                        }
                    } catch (Throwable th) {
                        try {
                            objectOutputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/F18<LX/DJl;>;LX/DGj;)V */
    public C4970DJj(InterfaceC4945DGj interfaceC4945DGj, F18 f18) {
        this.A00 = new DJm(interfaceC4945DGj);
        this.A01 = f18;
    }
}
