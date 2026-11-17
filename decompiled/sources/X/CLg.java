package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class CLg implements BxA {
    public CLi A00;
    public Executor A01;
    public ThreadPoolExecutor A02;
    public final Context A03;
    public final CLn A04;
    public final Object A05 = C3cG.A0T();
    public final CLk A06;

    public static void A00(CLg cLg) {
        synchronized (cLg.A05) {
            cLg.A00 = null;
            ThreadPoolExecutor threadPoolExecutor = cLg.A02;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            cLg.A01 = null;
            cLg.A02 = null;
        }
    }

    @Override // X.BxA
    public final void APg(CLi cLi) {
        BeS.A03(cLi, "LoaderCallback cannot be null");
        Object obj = this.A05;
        synchronized (obj) {
            this.A00 = cLi;
        }
        synchronized (obj) {
            if (this.A00 != null) {
                Executor executor = this.A01;
                Executor executor2 = executor;
                if (executor == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new Ev6("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.A02 = threadPoolExecutor;
                    this.A01 = threadPoolExecutor;
                    executor2 = threadPoolExecutor;
                }
                executor2.execute(new Runnable() { // from class: X.CLl
                    public static final String __redex_internal_original_name = "FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        CLg cLg = this.A00;
                        Object obj2 = cLg.A05;
                        synchronized (obj2) {
                            if (cLg.A00 == null) {
                                return;
                            }
                            try {
                                try {
                                    Context context = cLg.A03;
                                    C3413CLm c3413CLmA00 = CLs.A00(context, AbstractC2390BYs.A00(cLg.A04));
                                    int i = c3413CLmA00.A00;
                                    if (i != 0) {
                                        throw BV4.A0c(FGI.A0I("fetchFonts failed (", i, ")"));
                                    }
                                    CLt[] cLtArr = c3413CLmA00.A01.get(0);
                                    if (cLtArr == null || cLtArr.length == 0) {
                                        throw BV4.A0c("fetchFonts failed (empty result)");
                                    }
                                    CLt cLt = cLtArr[0];
                                    int i2 = cLt.A00;
                                    if (i2 == 2) {
                                        synchronized (obj2) {
                                            try {
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    } else if (i2 == 0) {
                                        try {
                                            Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                            Typeface typefaceA01 = CM2.A01(context, new CLt[]{cLt}, 0);
                                            try {
                                                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(cLt.A03, "r", null);
                                                if (parcelFileDescriptorOpenFileDescriptor != null) {
                                                    try {
                                                        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                                                        try {
                                                            FileChannel channel = fileInputStream.getChannel();
                                                            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                                            fileInputStream.close();
                                                            parcelFileDescriptorOpenFileDescriptor.close();
                                                            if (map != null && typefaceA01 != null) {
                                                                try {
                                                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                                    ByteBuffer byteBufferDuplicate = map.duplicate();
                                                                    byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
                                                                    byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
                                                                    int i3 = byteBufferDuplicate.getShort() & 65535;
                                                                    if (i3 > 100) {
                                                                        throw BV4.A0K("Cannot read metadata.");
                                                                    }
                                                                    byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
                                                                    int i4 = 0;
                                                                    while (true) {
                                                                        if (i4 >= i3) {
                                                                            break;
                                                                        }
                                                                        int i5 = byteBufferDuplicate.getInt();
                                                                        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
                                                                        long j = byteBufferDuplicate.getInt() & 4294967295L;
                                                                        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
                                                                        if (1835365473 == i5) {
                                                                            int iPosition = (int) (j - byteBufferDuplicate.position());
                                                                            if (iPosition < 0) {
                                                                                throw BV4.A0K(FGI.A0H("Cannot skip negative amount: ", iPosition));
                                                                            }
                                                                            BV7.A1L(byteBufferDuplicate, iPosition);
                                                                            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
                                                                            long j2 = byteBufferDuplicate.getInt() & 4294967295L;
                                                                            for (int i6 = 0; i6 < j2; i6++) {
                                                                                int i7 = byteBufferDuplicate.getInt();
                                                                                long j3 = byteBufferDuplicate.getInt() & 4294967295L;
                                                                                byteBufferDuplicate.getInt();
                                                                                if (1164798569 == i7 || 1701669481 == i7) {
                                                                                    byteBufferDuplicate.position((int) (j3 + j));
                                                                                    CLq cLq = new CLq();
                                                                                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                                                                                    int i8 = byteBufferDuplicate.getInt(byteBufferDuplicate.position()) + byteBufferDuplicate.position();
                                                                                    cLq.A04 = byteBufferDuplicate;
                                                                                    cLq.A00 = i8;
                                                                                    int i9 = i8 - byteBufferDuplicate.getInt(i8);
                                                                                    cLq.A02 = i9;
                                                                                    cLq.A01 = cLq.A04.getShort(i9);
                                                                                    CPK cpk = new CPK(typefaceA01, cLq);
                                                                                    Trace.endSection();
                                                                                    Trace.endSection();
                                                                                    synchronized (obj2) {
                                                                                        try {
                                                                                            CLi cLi2 = cLg.A00;
                                                                                            if (cLi2 != null) {
                                                                                                cLi2.A02(cpk);
                                                                                            }
                                                                                        } catch (Throwable th2) {
                                                                                            throw th2;
                                                                                        }
                                                                                    }
                                                                                    CLg.A00(cLg);
                                                                                    return;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            i4++;
                                                                        }
                                                                    }
                                                                    throw BV4.A0K("Cannot read metadata.");
                                                                } catch (Throwable th3) {
                                                                    Trace.endSection();
                                                                    throw th3;
                                                                }
                                                            }
                                                        } finally {
                                                        }
                                                    } catch (Throwable th4) {
                                                        try {
                                                            parcelFileDescriptorOpenFileDescriptor.close();
                                                        } catch (Throwable th5) {
                                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th5);
                                                        }
                                                        throw th4;
                                                    }
                                                }
                                            } catch (IOException unused) {
                                            }
                                            throw BV4.A0c("Unable to open file.");
                                        } catch (Throwable th6) {
                                            Trace.endSection();
                                            throw th6;
                                        }
                                    }
                                    throw BV4.A0c(FGI.A0I("fetchFonts result is not OK. (", i2, ")"));
                                } catch (Throwable th7) {
                                    synchronized (obj2) {
                                        CLi cLi3 = cLg.A00;
                                        if (cLi3 != null) {
                                            cLi3.A01(th7);
                                        }
                                        CLg.A00(cLg);
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException e) {
                            }
                        }
                    }
                });
            }
        }
    }

    public CLg(Context context, CLn cLn, CLk cLk) {
        this.A03 = context.getApplicationContext();
        this.A04 = cLn;
        this.A06 = cLk;
    }
}
