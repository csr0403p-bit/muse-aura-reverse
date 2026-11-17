package X;

import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.aura.localbrowser.LocalBrowserTask;
import com.facebook.aura.sharesheet.HatchShareSheetRepository;
import com.facebook.cache.disk.DefaultDiskStorage$IncompleteFileException;
import com.facebook.common.file.FileUtils$FileDeleteException;
import com.facebook.common.file.FileUtils$ParentDirNotFoundException;
import com.facebook.common.file.FileUtils$RenameException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;

/* renamed from: X.Efi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC7082Efi implements Runnable {
    public static final String __redex_internal_original_name = "BufferedDiskCache$put$1$1";
    public final /* synthetic */ CCV A00;
    public final /* synthetic */ C7081Efh A01;
    public final /* synthetic */ C6988Edo A02;

    public RunnableC7082Efi(CCV ccv, C7081Efh c7081Efh, C6988Edo c6988Edo) {
        this.A01 = c7081Efh;
        this.A00 = ccv;
        this.A02 = c6988Edo;
    }

    @Override // java.lang.Runnable
    public final void run() throws DefaultDiskStorage$IncompleteFileException {
        C7084Efk c7084Efk;
        C7090Efw c7090EfwA00;
        Object obj;
        String strA00;
        InterfaceC7089Efs interfaceC7089Efs;
        C7092Efy c7092Efy;
        File fileA0G;
        try {
            C7081Efh c7081Efh = this.A01;
            CCV ccv = this.A00;
            C6988Edo c6988Edo = this.A02;
            try {
                c7084Efk = c7081Efh.A00;
                c7090EfwA00 = C7090Efw.A00();
                c7090EfwA00.A00 = ccv;
                obj = c7084Efk.A0A;
                synchronized (obj) {
                    try {
                        try {
                            strA00 = CCU.A00(ccv);
                        } catch (UnsupportedEncodingException e) {
                            throw BV4.A0e(e);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IOException e2) {
                AbstractC3422CMk.A08(e2, "Failed to write to disk-cache for key %s", ccv.AMJ());
            }
            try {
                try {
                    synchronized (obj) {
                        try {
                            boolean zA00 = C7084Efk.A00(c7084Efk);
                            interfaceC7089Efs = c7084Efk.A06;
                            Integer num = interfaceC7089Efs.isExternal() ? C79.A01 : C79.A00;
                            C8T c8t = c7084Efk.A08;
                            long j = HatchShareSheetRepository.MAX_UPLOAD_BYTES;
                            c7092Efy = c7084Efk.A07;
                            long jA00 = HatchShareSheetRepository.MAX_UPLOAD_BYTES - c7092Efy.A00();
                            C8T.A01(c8t);
                            C8T.A01(c8t);
                            Lock lock = c8t.A01;
                            if (lock.tryLock()) {
                                try {
                                    if (SystemClock.uptimeMillis() - c8t.A00 > 120000) {
                                        c8t.A03 = C8T.A00(c8t.A03, c8t.A05);
                                        c8t.A02 = C8T.A00(c8t.A02, c8t.A04);
                                        c8t.A00 = SystemClock.uptimeMillis();
                                    }
                                    lock.unlock();
                                } catch (Throwable th2) {
                                    lock.unlock();
                                    throw th2;
                                }
                            }
                            StatFs statFs = num == C79.A00 ? c8t.A03 : c8t.A02;
                            long blockSizeLong = statFs != null ? statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong() : 0L;
                            if (blockSizeLong <= 0 || blockSizeLong < jA00) {
                                j = 10485760;
                            }
                            c7084Efk.A01 = j;
                            long jA002 = c7092Efy.A00();
                            if (jA002 > c7084Efk.A01 && !zA00) {
                                synchronized (c7092Efy) {
                                    try {
                                        c7092Efy.A02 = false;
                                        c7092Efy.A00 = -1L;
                                        c7092Efy.A01 = -1L;
                                    } finally {
                                    }
                                }
                                C7084Efk.A00(c7084Efk);
                            }
                            long j2 = c7084Efk.A01;
                            if (jA002 > j2) {
                                long j3 = (j2 * 9) / 10;
                                try {
                                    Collection<C7088Efr> collectionAFF = interfaceC7089Efs.AFF();
                                    C7384Etj.A0U(collectionAFF);
                                    long jNow = c7084Efk.A09.now() + LocalBrowserTask.DISCONNECT_GRACE_MS;
                                    ArrayList arrayListA11 = C60O.A11(collectionAFF.size());
                                    ArrayList arrayListA112 = C60O.A11(collectionAFF.size());
                                    for (C7088Efr c7088Efr : collectionAFF) {
                                        if (c7088Efr.A00() > jNow) {
                                            arrayListA11.add(c7088Efr);
                                        } else {
                                            arrayListA112.add(c7088Efr);
                                        }
                                    }
                                    AbstractC06907md.A04(arrayListA112, new C7573F4m(c7084Efk.A05, 3));
                                    arrayListA11.addAll(arrayListA112);
                                    long jA003 = c7092Efy.A00() - j3;
                                    Iterator it = arrayListA11.iterator();
                                    int i = 0;
                                    long j4 = 0;
                                    while (it.hasNext()) {
                                        C7088Efr c7088Efr2 = (C7088Efr) it.next();
                                        if (j4 > jA003) {
                                            break;
                                        }
                                        long jAaV = interfaceC7089Efs.AaV(c7088Efr2);
                                        c7084Efk.A0B.remove(c7088Efr2.A03);
                                        if (jAaV > 0) {
                                            i++;
                                            j4 += jAaV;
                                            C7090Efw.A00().A01();
                                        }
                                    }
                                    c7092Efy.A01(-j4, -i);
                                    interfaceC7089Efs.AYi();
                                } catch (IOException e3) {
                                    e3.getMessage();
                                    throw e3;
                                }
                            }
                        } finally {
                        }
                    }
                    C7091Efx c7091EfxANi = interfaceC7089Efs.ANi(ccv, strA00);
                    C7384Etj.A0U(c7091EfxANi);
                    try {
                        try {
                            File file = c7091EfxANi.A00;
                            FileOutputStream fileOutputStreamA0I = BV4.A0I(file);
                            try {
                                BqL bqL = new BqL(fileOutputStreamA0I);
                                bqL.A00 = 0L;
                                C7384Etj.A0X(c6988Edo);
                                InputStream inputStreamA07 = c6988Edo.A07();
                                if (inputStreamA07 == null) {
                                    throw BV4.A0U();
                                }
                                c7081Efh.A01.A00(inputStreamA07, bqL);
                                bqL.flush();
                                long j5 = bqL.A00;
                                fileOutputStreamA0I.close();
                                if (file.length() != j5) {
                                    long length = file.length();
                                    StringBuilder sbA0g = C3cG.A0g("File was not written completely. Expected: ");
                                    sbA0g.append(j5);
                                    throw new DefaultDiskStorage$IncompleteFileException(BV7.A0z(", found: ", sbA0g, length));
                                }
                                synchronized (obj) {
                                    try {
                                        C7083Efj c7083Efj = c7091EfxANi.A02;
                                        long jNow2 = c7083Efj.A00.now();
                                        String str = c7091EfxANi.A01;
                                        fileA0G = BV4.A0G(FGI.A0d(C7083Efj.A00(c7083Efj, str), File.separator, str, ".cnt"));
                                        try {
                                            fileA0G.delete();
                                            if (!file.renameTo(fileA0G)) {
                                                Throwable fileNotFoundException = !fileA0G.exists() ? file.getParentFile().exists() ? !file.exists() ? new FileNotFoundException(file.getAbsolutePath()) : null : new FileUtils$ParentDirNotFoundException(file.getAbsolutePath()) : new FileUtils$FileDeleteException(fileA0G.getAbsolutePath());
                                                FileUtils$RenameException fileUtils$RenameException = new FileUtils$RenameException(FGI.A0d("Unknown error renaming ", file.getAbsolutePath(), " to ", fileA0G.getAbsolutePath()));
                                                fileUtils$RenameException.initCause(fileNotFoundException);
                                                throw fileUtils$RenameException;
                                            }
                                            if (fileA0G.exists()) {
                                                fileA0G.setLastModified(jNow2);
                                            }
                                            c7084Efk.A0B.add(strA00);
                                            c7092Efy.A01(fileA0G.length(), 1L);
                                        } catch (FileUtils$RenameException e4) {
                                            e4.getCause();
                                            throw e4;
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                                fileA0G.length();
                                synchronized (c7092Efy) {
                                }
                                if (file.exists() && !file.delete()) {
                                    AbstractC3422CMk.A00(C7084Efk.class, "Failed to delete temp file");
                                }
                                C7080Efg c7080Efg = c7081Efh.A02;
                                C7384Etj.A0X(c6988Edo);
                                c7080Efg.A02(ccv, c6988Edo);
                                c6988Edo.close();
                            } catch (Throwable th4) {
                                fileOutputStreamA0I.close();
                            }
                        } catch (Throwable th5) {
                            File file2 = c7091EfxANi.A00;
                            if (!file2.exists() || file2.delete()) {
                                throw th5;
                            }
                            AbstractC3422CMk.A00(C7084Efk.class, "Failed to delete temp file");
                            throw th5;
                        }
                    } catch (FileNotFoundException e5) {
                    }
                } finally {
                    c7090EfwA00.A01();
                }
            } catch (IOException e6) {
                c7090EfwA00.A01 = e6;
                CFL cfl = AbstractC3422CMk.A00;
                if (CFL.A02(cfl)) {
                    cfl.e(C7084Efk.class.getSimpleName(), "Failed inserting a file into the cache", e6);
                }
                throw e6;
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                C7080Efg c7080Efg2 = this.A01.A02;
                CCV ccv2 = this.A00;
                C6988Edo c6988Edo2 = this.A02;
                C7384Etj.A0X(c6988Edo2);
                c7080Efg2.A02(ccv2, c6988Edo2);
                c6988Edo2.close();
                throw th7;
            }
        }
    }
}
