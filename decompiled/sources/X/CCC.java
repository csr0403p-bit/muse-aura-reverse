package X;

import android.os.Build;
import android.os.Process;
import com.facebook.systrace.Systrace;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public final class CCC implements InterfaceC3458COe {
    @Override // X.InterfaceC3458COe
    public final void AWb() {
    }

    @Override // X.InterfaceC3458COe
    public final void AWa() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        int iIndexOf;
        CCD ccd = CCD.$redex_init_class;
        if ((64 & COZ.A02) != 0) {
            Systrace.A07("thread_name", Process.myTid(), Thread.currentThread().getName());
        }
        if ((1 & COZ.A02) != 0) {
            StringBuilder sbA0p = BV4.A0p(127);
            sbA0p.append("Android trace tags: ");
            sbA0p.append(AbstractC3459COf.A00("debug.atrace.tags.enableflags"));
            sbA0p.append(", Facebook trace tags: ");
            Systrace.A07("process_labels", 0, BV4.A0m(sbA0p, COZ.A02));
        }
        if ((64 & COZ.A02) != 0) {
            try {
                FileReader fileReader = new FileReader("/proc/self/cmdline");
                try {
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    try {
                        String line = bufferedReader.readLine();
                        if (line != null && (iIndexOf = line.indexOf(0)) >= 0) {
                            line = line.substring(0, iIndexOf);
                        }
                        bufferedReader.close();
                        fileReader.close();
                        Systrace.A07("process_name", 0, line);
                        Systrace.A07("process_labels", 0, String.format("device=%s,heapgrowthlimit=%s,heapstartsize=%s,heapminfree=%s,heapmaxfree=%s,heaptargetutilization=%s", Build.MODEL, AbstractC3459COf.A02("dalvik.vm.heapgrowthlimit"), AbstractC3459COf.A02("dalvik.vm.heapstartsize"), AbstractC3459COf.A02("dalvik.vm.heapmaxfree"), AbstractC3459COf.A02("dalvik.vm.heapminfree"), AbstractC3459COf.A02("dalvik.vm.heaptargetutilization")));
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e) {
                throw BV4.A0e(e);
            }
        }
    }
}
