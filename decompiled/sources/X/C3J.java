package X;

import android.os.StrictMode;
import android.util.Log;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.soloader.MinElf$ElfError;
import com.facebook.soloader.SoLoaderULErrorFactory;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes5.dex */
public abstract class C3J {
    public static final ReentrantReadWriteLock A01 = new ReentrantReadWriteLock();
    public static final HashSet<String> A00 = new C2371BVz();

    public static long A00(C3N c3n, ByteBuffer byteBuffer, long j) {
        A02(c3n, byteBuffer, 4, j);
        return byteBuffer.getInt() & 4294967295L;
    }

    public static void A02(C3N c3n, ByteBuffer byteBuffer, int i, long j) {
        int iAZ5;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (iAZ5 = c3n.AZ5(byteBuffer, j)) != -1) {
            j += iAZ5;
        }
        if (byteBuffer.remaining() > 0) {
            throw new MinElf$ElfError("ELF file truncated");
        }
        byteBuffer.position(0);
    }

    public static String[] A03(C3N c3n) {
        long jA00;
        long j;
        short s;
        int i;
        long jA002;
        long jA003;
        long jA004;
        long jA005;
        long jA006;
        long jA007;
        long jA008;
        long jA009;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jA0010 = A00(c3n, byteBufferAllocate, 0L);
        if (jA0010 != 1179403647) {
            StringBuilder sbA0x = C60O.A0x("file is not ELF: magic is 0x");
            sbA0x.append(Long.toHexString(jA0010));
            sbA0x.append(", it should be ");
            sbA0x.append(Long.toHexString(1179403647L));
            sbA0x.append(", file size: ");
            throw new MinElf$ElfError(BV4.A0m(sbA0x, c3n.size()));
        }
        A02(c3n, byteBufferAllocate, 1, 4L);
        boolean zA1O = BV5.A1O((short) BV4.A02(byteBufferAllocate), 1);
        A02(c3n, byteBufferAllocate, 1, 5L);
        if (((short) BV4.A02(byteBufferAllocate)) == 2) {
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        }
        if (zA1O) {
            jA00 = A00(c3n, byteBufferAllocate, 28L);
        } else {
            A02(c3n, byteBufferAllocate, 8, 32L);
            jA00 = byteBufferAllocate.getLong();
        }
        if (zA1O) {
            A02(c3n, byteBufferAllocate, 2, 44L);
            s = 65535;
            i = byteBufferAllocate.getShort() & 65535;
            j = 44;
        } else {
            j = 44;
            A02(c3n, byteBufferAllocate, 2, 56L);
            s = 65535;
            i = byteBufferAllocate.getShort() & 65535;
        }
        long jA0011 = i;
        A02(c3n, byteBufferAllocate, 2, zA1O ? 42L : 54L);
        int i2 = byteBufferAllocate.getShort() & s;
        if (jA0011 == 65535) {
            if (zA1O) {
                jA009 = A00(c3n, byteBufferAllocate, 32L) + 28;
            } else {
                A02(c3n, byteBufferAllocate, 8, 40L);
                jA009 = byteBufferAllocate.getLong() + j;
            }
            jA0011 = A00(c3n, byteBufferAllocate, jA009);
        }
        long j2 = jA00;
        long j3 = 0;
        while (true) {
            if (j3 >= jA0011) {
                break;
            }
            if (A00(c3n, byteBufferAllocate, j2) == 2) {
                if (zA1O) {
                    jA002 = A00(c3n, byteBufferAllocate, j2 + 4);
                } else {
                    A02(c3n, byteBufferAllocate, 8, j2 + 8);
                    jA002 = byteBufferAllocate.getLong();
                }
                if (jA002 != 0) {
                    long j4 = jA002;
                    long jA0012 = 0;
                    int i3 = 0;
                    do {
                        if (zA1O) {
                            jA003 = A00(c3n, byteBufferAllocate, j4);
                        } else {
                            A02(c3n, byteBufferAllocate, 8, j4);
                            jA003 = byteBufferAllocate.getLong();
                        }
                        if (jA003 == 1) {
                            if (i3 == Integer.MAX_VALUE) {
                                throw new MinElf$ElfError("malformed DT_NEEDED section");
                            }
                            i3++;
                        } else if (jA003 == 5) {
                            if (zA1O) {
                                jA0012 = A00(c3n, byteBufferAllocate, j4 + 4);
                            } else {
                                A02(c3n, byteBufferAllocate, 8, j4 + 8);
                                jA0012 = byteBufferAllocate.getLong();
                            }
                        }
                        j4 += zA1O ? 8L : 16L;
                    } while (jA003 != 0);
                    if (jA0012 == 0) {
                        throw new MinElf$ElfError("Dynamic section string-table not found");
                    }
                    int i4 = 0;
                    while (true) {
                        if (i4 >= jA0011) {
                            break;
                        }
                        if (A00(c3n, byteBufferAllocate, jA00) == 1) {
                            if (zA1O) {
                                jA004 = A00(c3n, byteBufferAllocate, jA00 + 8);
                                jA005 = A00(c3n, byteBufferAllocate, jA00 + 20);
                            } else {
                                A02(c3n, byteBufferAllocate, 8, jA00 + 16);
                                jA004 = byteBufferAllocate.getLong();
                                A02(c3n, byteBufferAllocate, 8, jA00 + 40);
                                jA005 = byteBufferAllocate.getLong();
                            }
                            if (jA004 <= jA0012 && jA0012 < jA005 + jA004) {
                                if (zA1O) {
                                    jA006 = A00(c3n, byteBufferAllocate, jA00 + 4);
                                } else {
                                    A02(c3n, byteBufferAllocate, 8, jA00 + 8);
                                    jA006 = byteBufferAllocate.getLong();
                                }
                                long j5 = jA006 + (jA0012 - jA004);
                                if (j5 != 0) {
                                    String[] strArr = new String[i3];
                                    int i5 = 0;
                                    do {
                                        if (zA1O) {
                                            jA007 = A00(c3n, byteBufferAllocate, jA002);
                                        } else {
                                            A02(c3n, byteBufferAllocate, 8, jA002);
                                            jA007 = byteBufferAllocate.getLong();
                                        }
                                        if (jA007 == 1) {
                                            if (zA1O) {
                                                jA008 = A00(c3n, byteBufferAllocate, jA002 + 4);
                                            } else {
                                                A02(c3n, byteBufferAllocate, 8, jA002 + 8);
                                                jA008 = byteBufferAllocate.getLong();
                                            }
                                            long j6 = jA008 + j5;
                                            StringBuilder sb = new StringBuilder();
                                            while (true) {
                                                long j7 = 1 + j6;
                                                A02(c3n, byteBufferAllocate, 1, j6);
                                                short s2 = (short) (byteBufferAllocate.get() & 255);
                                                if (s2 == 0) {
                                                    break;
                                                }
                                                sb.append((char) s2);
                                                j6 = j7;
                                            }
                                            strArr[i5] = sb.toString();
                                            if (i5 == Integer.MAX_VALUE) {
                                                throw new MinElf$ElfError("malformed DT_NEEDED section");
                                            }
                                            i5++;
                                        }
                                        jA002 += zA1O ? 8L : 16L;
                                    } while (jA007 != 0);
                                    if (i5 == i3) {
                                        return strArr;
                                    }
                                    throw new MinElf$ElfError("malformed DT_NEEDED section");
                                }
                            }
                        }
                        jA00 += i2;
                        i4++;
                    }
                    throw new MinElf$ElfError("did not find file offset of DT_STRTAB table");
                }
            } else {
                j2 += i2;
                j3++;
            }
        }
        throw new MinElf$ElfError("ELF file does not contain dynamic linking information");
    }

    public static String[] A04(C3N c3n, String str) {
        String[] strArrA03;
        C3K.A01("soloader.NativeDeps.getDependencies[", str, "]");
        AtomicReference<InterfaceC10426Hc0[]> atomicReference = C3M.A00;
        InterfaceC10426Hc0[] interfaceC10426Hc0Arr = atomicReference.get();
        if (interfaceC10426Hc0Arr != null && 0 < interfaceC10426Hc0Arr.length) {
            throw BV4.A0a("onGetDependenciesStart");
        }
        try {
            try {
                try {
                    BV4.A1K("Falling back to custom ELF parsing when loading ", str, ", this can be slow", "SoLoader[NativeDeps]");
                    if (c3n instanceof C34) {
                        C34 c34 = (C34) c3n;
                        int i = 0;
                        while (true) {
                            try {
                                strArrA03 = A03(c34);
                                break;
                            } catch (ClosedByInterruptException e) {
                                i++;
                                if (i > 4) {
                                    throw e;
                                }
                                Thread.interrupted();
                                Log.e("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e);
                                FileInputStream fileInputStream = new FileInputStream(c34.A00);
                                c34.A01 = fileInputStream;
                                c34.A02 = fileInputStream.getChannel();
                            }
                        }
                    } else {
                        strArrA03 = A03(c3n);
                    }
                    InterfaceC10426Hc0[] interfaceC10426Hc0Arr2 = atomicReference.get();
                    if (interfaceC10426Hc0Arr2 != null && 0 < interfaceC10426Hc0Arr2.length) {
                        throw BV4.A0a("onGetDependenciesEnd");
                    }
                    C3K.A00();
                    return strArrA03;
                } catch (Throwable th) {
                    InterfaceC10426Hc0[] interfaceC10426Hc0Arr3 = atomicReference.get();
                    if (interfaceC10426Hc0Arr3 != null && 0 < interfaceC10426Hc0Arr3.length) {
                        throw BV4.A0a("onGetDependenciesEnd");
                    }
                    C3K.A00();
                    throw th;
                }
            } catch (MinElf$ElfError e2) {
                throw SoLoaderULErrorFactory.create(str, e2);
            }
        } catch (Error | RuntimeException e3) {
            throw e3;
        }
    }

    public static void A01(StrictMode.ThreadPolicy threadPolicy, C3N c3n, String str, int i) {
        String[] strArrA04 = A04(c3n, str);
        C35.A00(FGI.A0d("Loading ", str, "'s dependencies: ", Arrays.toString(strArrA04)));
        for (String str2 : strArrA04) {
            if (!str2.startsWith(CustomConnectorRegisterRepositoryKt.ROOT_PATH) && !A00.contains(str2)) {
                ETi.A07(threadPolicy, str2, i);
            }
        }
    }
}
