package X;

import X.GHM;
import X.GHW;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class GHM<MessageType extends GHM<MessageType, BuilderType>, BuilderType extends GHW<MessageType, BuilderType>> extends GHS<MessageType, BuilderType> {
    public static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    public static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    public static final int UNINITIALIZED_HASH_CODE = 0;
    public static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    public static Map<Class<?>, GHM<?, ?>> defaultInstanceMap = C60O.A1C();
    public int memoizedSerializedSize = -1;
    public GHQ unknownFields = GHQ.A05;

    /* JADX WARN: Incorrect types in method signature: <T:LX/GHM<TT;*>;>(TT;[BLX/HzL;)TT; */
    public static GHM A03(HzL defaultInstance, GHM data, byte[] extensionRegistry) throws Throwable {
        InvalidProtocolBufferException e;
        GHM ghm = data;
        int length = extensionRegistry.length;
        if (length != 0) {
            ghm = (GHM) data.A0E(C79.A0K);
            try {
                GHV ghvA0d = AbstractC7609F5w.A0d(ghm);
                ghvA0d.AQh(new C9390GHf(defaultInstance), ghm, extensionRegistry, 0, length);
                ghvA0d.AQ3(ghm);
            } catch (InvalidProtocolBufferException e2) {
                e = e2;
                if (e.wasThrownFromInputStream) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage(), e);
                    invalidProtocolBufferException.unfinishedMessage = null;
                    e = invalidProtocolBufferException;
                }
                e.unfinishedMessage = ghm;
                throw e;
            } catch (UninitializedMessageException e3) {
                e = AbstractC7609F5w.A0c(e3.getMessage());
                e.unfinishedMessage = ghm;
                throw e;
            } catch (IOException e4) {
                if (e4.getCause() instanceof InvalidProtocolBufferException) {
                    throw e4.getCause();
                }
                e = new InvalidProtocolBufferException(e4.getMessage(), e4);
                e.unfinishedMessage = null;
                e.unfinishedMessage = ghm;
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                e = AbstractC7609F5w.A0c("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                e.unfinishedMessage = ghm;
                throw e;
            }
        }
        A06(ghm);
        return ghm;
    }

    public static C9391GHg A00(GHM ghm) {
        return new C9391GHg(ghm);
    }

    /* JADX WARN: Incorrect types in method signature: <T:LX/GHM<TT;*>;>(TT;LX/GEc;LX/HzL;)TT; */
    public static GHM A01(AbstractC9321GEc defaultInstance, HzL data, GHM extensionRegistry) throws Throwable {
        C9324GEf c9324GEf = (C9324GEf) defaultInstance;
        byte[] bArr = c9324GEf.bytes;
        int i = c9324GEf instanceof C9325GEg ? ((C9325GEg) c9324GEf).bytesOffset : 0;
        int iA02 = c9324GEf.A02();
        GGE gge = new GGE(bArr, i, iA02);
        try {
            gge.A0M(iA02);
            GHM ghmA02 = A02(gge, data, extensionRegistry);
            try {
                gge.A0V();
                A06(ghmA02);
                return ghmA02;
            } catch (InvalidProtocolBufferException e) {
                e.unfinishedMessage = ghmA02;
                throw e;
            }
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:LX/GHM<TT;*>;>(TT;LX/GHR;LX/HzL;)TT; */
    public static GHM A02(GHR instance, HzL input, GHM extensionRegistry) throws Throwable {
        InvalidProtocolBufferException e;
        GHM ghm = (GHM) extensionRegistry.A0E(C79.A0K);
        try {
            GHV ghvA0d = AbstractC7609F5w.A0d(ghm);
            GHN ghn = instance.A01;
            if (ghn == null) {
                ghn = new GHN(instance);
            }
            ghvA0d.AQg(ghn, input, ghm);
            ghvA0d.AQ3(ghm);
            return ghm;
        } catch (InvalidProtocolBufferException e2) {
            e = e2;
            if (e.wasThrownFromInputStream) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage(), e);
                invalidProtocolBufferException.unfinishedMessage = null;
                e = invalidProtocolBufferException;
            }
            e.unfinishedMessage = ghm;
            throw e;
        } catch (UninitializedMessageException e3) {
            InvalidProtocolBufferException invalidProtocolBufferExceptionA0c = AbstractC7609F5w.A0c(e3.getMessage());
            invalidProtocolBufferExceptionA0c.unfinishedMessage = ghm;
            throw invalidProtocolBufferExceptionA0c;
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw e4.getCause();
            }
            e = new InvalidProtocolBufferException(e4.getMessage(), e4);
            e.unfinishedMessage = null;
            e.unfinishedMessage = ghm;
            throw e;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof InvalidProtocolBufferException) {
                throw e5.getCause();
            }
            throw e5;
        }
    }

    public static GHb A04(InterfaceC9329GEk interfaceC9329GEk, String str, Object[] objArr) {
        return new GHb(interfaceC9329GEk, str, objArr);
    }

    /* JADX WARN: Incorrect return type in method signature: <T:LX/GHM<TT;*>;>(TT;)TT; */
    public static void A06(GHM message) throws InvalidProtocolBufferException {
        byte bByteValue;
        if (message == null || (bByteValue = ((Number) message.A0E(C79.A00)).byteValue()) == 1) {
            return;
        }
        if (bByteValue != 0) {
            boolean zAOY = AbstractC7609F5w.A0d(message).AOY(message);
            message.A0E(C79.A01);
            if (zAOY) {
                return;
            }
        }
        InvalidProtocolBufferException invalidProtocolBufferExceptionA0c = AbstractC7609F5w.A0c(new UninitializedMessageException().getMessage());
        invalidProtocolBufferExceptionA0c.unfinishedMessage = message;
        throw invalidProtocolBufferExceptionA0c;
    }

    /* JADX WARN: Incorrect types in method signature: <T:LX/GHM<**>;>(Ljava/lang/Class<TT;>;TT;)V */
    public static void A07(GHM clazz, Class defaultInstance) {
        clazz.memoizedSerializedSize &= Integer.MAX_VALUE;
        defaultInstanceMap.put(defaultInstance, clazz);
    }

    public final Object A0E(Integer num) {
        InterfaceC9394GHj interfaceC9394GHjA00;
        InterfaceC9394GHj interfaceC9394GHjA002;
        InterfaceC9394GHj interfaceC9394GHjA003;
        InterfaceC9394GHj interfaceC9394GHjA004;
        InterfaceC9394GHj interfaceC9394GHjA005;
        InterfaceC9394GHj interfaceC9394GHjA006;
        InterfaceC9394GHj interfaceC9394GHjA007;
        InterfaceC9394GHj interfaceC9394GHjA008;
        InterfaceC9394GHj interfaceC9394GHjA009;
        InterfaceC9394GHj interfaceC9394GHjA0010;
        InterfaceC9394GHj interfaceC9394GHjA0011;
        InterfaceC9394GHj interfaceC9394GHjA0012;
        InterfaceC9394GHj interfaceC9394GHjA0013;
        InterfaceC9394GHj interfaceC9394GHjA0014;
        InterfaceC9394GHj interfaceC9394GHjA0015;
        InterfaceC9394GHj interfaceC9394GHjA0016;
        InterfaceC9394GHj interfaceC9394GHjA0017;
        InterfaceC9394GHj interfaceC9394GHjA0018;
        InterfaceC9394GHj interfaceC9394GHjA0019;
        InterfaceC9394GHj interfaceC9394GHjA0020;
        InterfaceC9394GHj interfaceC9394GHjA0021;
        InterfaceC9394GHj interfaceC9394GHjA0022;
        InterfaceC9394GHj interfaceC9394GHjA0023;
        InterfaceC9394GHj interfaceC9394GHjA0024;
        InterfaceC9394GHj interfaceC9394GHjA0025;
        InterfaceC9394GHj interfaceC9394GHjA0026;
        InterfaceC9394GHj interfaceC9394GHjA0027;
        InterfaceC9394GHj interfaceC9394GHjA0028;
        InterfaceC9394GHj interfaceC9394GHjA0029;
        InterfaceC9394GHj interfaceC9394GHjA0030;
        InterfaceC9394GHj interfaceC9394GHjA0031;
        InterfaceC9394GHj interfaceC9394GHjA0032;
        InterfaceC9394GHj interfaceC9394GHjA0033;
        InterfaceC9394GHj interfaceC9394GHjA0034;
        InterfaceC9394GHj interfaceC9394GHjA0035;
        InterfaceC9394GHj interfaceC9394GHjA0036;
        InterfaceC9394GHj interfaceC9394GHjA0037;
        InterfaceC9394GHj interfaceC9394GHjA0038;
        InterfaceC9394GHj interfaceC9394GHjA0039;
        InterfaceC9394GHj interfaceC9394GHjA0040;
        if (this instanceof GJW) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GJW.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
                case 3:
                    return new GJW();
                case 4:
                    return new GJX();
                case 5:
                    return GJW.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GJW> interfaceC9394GHj = GJW.PARSER;
                    if (interfaceC9394GHj != null) {
                        return interfaceC9394GHj;
                    }
                    synchronized (GJW.class) {
                        interfaceC9394GHjA0040 = GJW.PARSER;
                        if (interfaceC9394GHjA0040 == null) {
                            HzL hzL = C9391GHg.A01;
                            interfaceC9394GHjA0040 = A00(GJW.DEFAULT_INSTANCE);
                            GJW.PARSER = interfaceC9394GHjA0040;
                        }
                    }
                    return interfaceC9394GHjA0040;
            }
        }
        if (this instanceof GK6) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GK6.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
                case 3:
                    return new GK6();
                case 4:
                    return new GK7();
                case 5:
                    return GK6.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GK6> interfaceC9394GHj2 = GK6.PARSER;
                    if (interfaceC9394GHj2 != null) {
                        return interfaceC9394GHj2;
                    }
                    synchronized (GK6.class) {
                        interfaceC9394GHjA0039 = GK6.PARSER;
                        if (interfaceC9394GHjA0039 == null) {
                            HzL hzL2 = C9391GHg.A01;
                            interfaceC9394GHjA0039 = A00(GK6.DEFAULT_INSTANCE);
                            GK6.PARSER = interfaceC9394GHjA0039;
                        }
                    }
                    return interfaceC9394GHjA0039;
            }
        }
        if (this instanceof GJU) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GJU.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"saltSize_"});
                case 3:
                    return new GJU();
                case 4:
                    return new GJV();
                case 5:
                    return GJU.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GJU> interfaceC9394GHj3 = GJU.PARSER;
                    if (interfaceC9394GHj3 != null) {
                        return interfaceC9394GHj3;
                    }
                    synchronized (GJU.class) {
                        interfaceC9394GHjA0038 = GJU.PARSER;
                        if (interfaceC9394GHjA0038 == null) {
                            HzL hzL3 = C9391GHg.A01;
                            interfaceC9394GHjA0038 = A00(GJU.DEFAULT_INSTANCE);
                            GJU.PARSER = interfaceC9394GHjA0038;
                        }
                    }
                    return interfaceC9394GHjA0038;
            }
        }
        if (this instanceof C9440GJe) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(C9440GJe.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\u1009\u0000", new Object[]{"bitField0_", "version_", "params_"});
                case 3:
                    return new C9440GJe();
                case 4:
                    return new C9441GJf();
                case 5:
                    return C9440GJe.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<C9440GJe> interfaceC9394GHj4 = C9440GJe.PARSER;
                    if (interfaceC9394GHj4 != null) {
                        return interfaceC9394GHj4;
                    }
                    synchronized (C9440GJe.class) {
                        interfaceC9394GHjA0037 = C9440GJe.PARSER;
                        if (interfaceC9394GHjA0037 == null) {
                            HzL hzL4 = C9391GHg.A01;
                            interfaceC9394GHjA0037 = A00(C9440GJe.DEFAULT_INSTANCE);
                            C9440GJe.PARSER = interfaceC9394GHjA0037;
                        }
                    }
                    return interfaceC9394GHjA0037;
            }
        }
        if (this instanceof GK8) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GK8.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
                case 3:
                    return new GK8();
                case 4:
                    return new GK9();
                case 5:
                    return GK8.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GK8> interfaceC9394GHj5 = GK8.PARSER;
                    if (interfaceC9394GHj5 != null) {
                        return interfaceC9394GHj5;
                    }
                    synchronized (GK8.class) {
                        interfaceC9394GHjA0036 = GK8.PARSER;
                        if (interfaceC9394GHjA0036 == null) {
                            HzL hzL5 = C9391GHg.A01;
                            interfaceC9394GHjA0036 = A00(GK8.DEFAULT_INSTANCE);
                            GK8.PARSER = interfaceC9394GHjA0036;
                        }
                    }
                    return interfaceC9394GHjA0036;
            }
        }
        if (this instanceof C9419GIi) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(C9419GIi.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b", new Object[]{"configName_", "entry_", C9421GIk.class});
                case 3:
                    return new C9419GIi();
                case 4:
                    return new C9420GIj();
                case 5:
                    return C9419GIi.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<C9419GIi> interfaceC9394GHj6 = C9419GIi.PARSER;
                    if (interfaceC9394GHj6 != null) {
                        return interfaceC9394GHj6;
                    }
                    synchronized (C9419GIi.class) {
                        interfaceC9394GHjA0035 = C9419GIi.PARSER;
                        if (interfaceC9394GHjA0035 == null) {
                            HzL hzL6 = C9391GHg.A01;
                            interfaceC9394GHjA0035 = A00(C9419GIi.DEFAULT_INSTANCE);
                            C9419GIi.PARSER = interfaceC9394GHjA0035;
                        }
                    }
                    return interfaceC9394GHjA0035;
            }
        }
        if (this instanceof GJQ) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GJQ.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u1009\u0000", new Object[]{"bitField0_", "kekUri_", "dekTemplate_"});
                case 3:
                    return new GJQ();
                case 4:
                    return new GJR();
                case 5:
                    return GJQ.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GJQ> interfaceC9394GHj7 = GJQ.PARSER;
                    if (interfaceC9394GHj7 != null) {
                        return interfaceC9394GHj7;
                    }
                    synchronized (GJQ.class) {
                        interfaceC9394GHjA0034 = GJQ.PARSER;
                        if (interfaceC9394GHjA0034 == null) {
                            HzL hzL7 = C9391GHg.A01;
                            interfaceC9394GHjA0034 = A00(GJQ.DEFAULT_INSTANCE);
                            GJQ.PARSER = interfaceC9394GHjA0034;
                        }
                    }
                    return interfaceC9394GHjA0034;
            }
        }
        if (this instanceof GJi) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GJi.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000", new Object[]{"bitField0_", "version_", "params_"});
                case 3:
                    return new GJi();
                case 4:
                    return new GJj();
                case 5:
                    return GJi.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GJi> interfaceC9394GHj8 = GJi.PARSER;
                    if (interfaceC9394GHj8 != null) {
                        return interfaceC9394GHj8;
                    }
                    synchronized (GJi.class) {
                        interfaceC9394GHjA0033 = GJi.PARSER;
                        if (interfaceC9394GHjA0033 == null) {
                            HzL hzL8 = C9391GHg.A01;
                            interfaceC9394GHjA0033 = A00(GJi.DEFAULT_INSTANCE);
                            GJi.PARSER = interfaceC9394GHjA0033;
                        }
                    }
                    return interfaceC9394GHjA0033;
            }
        }
        if (this instanceof GJD) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GJD.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"keyUri_"});
                case 3:
                    return new GJD();
                case 4:
                    return new GJE();
                case 5:
                    return GJD.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GJD> interfaceC9394GHj9 = GJD.PARSER;
                    if (interfaceC9394GHj9 != null) {
                        return interfaceC9394GHj9;
                    }
                    synchronized (GJD.class) {
                        interfaceC9394GHjA0032 = GJD.PARSER;
                        if (interfaceC9394GHjA0032 == null) {
                            HzL hzL9 = C9391GHg.A01;
                            interfaceC9394GHjA0032 = A00(GJD.DEFAULT_INSTANCE);
                            GJD.PARSER = interfaceC9394GHjA0032;
                        }
                    }
                    return interfaceC9394GHjA0032;
            }
        }
        if (this instanceof C9442GJg) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(C9442GJg.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000", new Object[]{"bitField0_", "version_", "params_"});
                case 3:
                    return new C9442GJg();
                case 4:
                    return new GJh();
                case 5:
                    return C9442GJg.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<C9442GJg> interfaceC9394GHj10 = C9442GJg.PARSER;
                    if (interfaceC9394GHj10 != null) {
                        return interfaceC9394GHj10;
                    }
                    synchronized (C9442GJg.class) {
                        interfaceC9394GHjA0031 = C9442GJg.PARSER;
                        if (interfaceC9394GHjA0031 == null) {
                            HzL hzL10 = C9391GHg.A01;
                            interfaceC9394GHjA0031 = A00(C9442GJg.DEFAULT_INSTANCE);
                            C9442GJg.PARSER = interfaceC9394GHjA0031;
                        }
                    }
                    return interfaceC9394GHjA0031;
            }
        }
        if (this instanceof GJ3) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GJ3.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", GJ7.class});
                case 3:
                    return new GJ3();
                case 4:
                    return new GJ6();
                case 5:
                    return GJ3.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GJ3> interfaceC9394GHj11 = GJ3.PARSER;
                    if (interfaceC9394GHj11 != null) {
                        return interfaceC9394GHj11;
                    }
                    synchronized (GJ3.class) {
                        interfaceC9394GHjA0030 = GJ3.PARSER;
                        if (interfaceC9394GHjA0030 == null) {
                            HzL hzL11 = C9391GHg.A01;
                            interfaceC9394GHjA0030 = A00(GJ3.DEFAULT_INSTANCE);
                            GJ3.PARSER = interfaceC9394GHjA0030;
                        }
                    }
                    return interfaceC9394GHjA0030;
            }
        }
        if (this instanceof GJ7) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GJ7.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 3:
                    return new GJ7();
                case 4:
                    return new GJ8();
                case 5:
                    return GJ7.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GJ7> interfaceC9394GHj12 = GJ7.PARSER;
                    if (interfaceC9394GHj12 != null) {
                        return interfaceC9394GHj12;
                    }
                    synchronized (GJ7.class) {
                        interfaceC9394GHjA0029 = GJ7.PARSER;
                        if (interfaceC9394GHjA0029 == null) {
                            HzL hzL12 = C9391GHg.A01;
                            interfaceC9394GHjA0029 = A00(GJ7.DEFAULT_INSTANCE);
                            GJ7.PARSER = interfaceC9394GHjA0029;
                        }
                    }
                    return interfaceC9394GHjA0029;
            }
        }
        if (this instanceof GJ4) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GJ4.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", GJA.class});
                case 3:
                    return new GJ4();
                case 4:
                    return new GJ5();
                case 5:
                    return GJ4.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GJ4> interfaceC9394GHj13 = GJ4.PARSER;
                    if (interfaceC9394GHj13 != null) {
                        return interfaceC9394GHj13;
                    }
                    synchronized (GJ4.class) {
                        interfaceC9394GHjA0028 = GJ4.PARSER;
                        if (interfaceC9394GHjA0028 == null) {
                            HzL hzL13 = C9391GHg.A01;
                            interfaceC9394GHjA0028 = A00(GJ4.DEFAULT_INSTANCE);
                            GJ4.PARSER = interfaceC9394GHjA0028;
                        }
                    }
                    return interfaceC9394GHjA0028;
            }
        }
        if (this instanceof GJA) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GJA.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"bitField0_", "keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 3:
                    return new GJA();
                case 4:
                    return new GJB();
                case 5:
                    return GJA.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GJA> interfaceC9394GHj14 = GJA.PARSER;
                    if (interfaceC9394GHj14 != null) {
                        return interfaceC9394GHj14;
                    }
                    synchronized (GJA.class) {
                        interfaceC9394GHjA0027 = GJA.PARSER;
                        if (interfaceC9394GHjA0027 == null) {
                            HzL hzL14 = C9391GHg.A01;
                            interfaceC9394GHjA0027 = A00(GJA.DEFAULT_INSTANCE);
                            GJA.PARSER = interfaceC9394GHjA0027;
                        }
                    }
                    return interfaceC9394GHjA0027;
            }
        }
        if (this instanceof C9421GIk) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(C9421GIk.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u000b\u0004\u0007\u0005\u0208", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
                case 3:
                    return new C9421GIk();
                case 4:
                    return new C9422GIl();
                case 5:
                    return C9421GIk.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<C9421GIk> interfaceC9394GHj15 = C9421GIk.PARSER;
                    if (interfaceC9394GHj15 != null) {
                        return interfaceC9394GHj15;
                    }
                    synchronized (C9421GIk.class) {
                        interfaceC9394GHjA0026 = C9421GIk.PARSER;
                        if (interfaceC9394GHjA0026 == null) {
                            HzL hzL15 = C9391GHg.A01;
                            interfaceC9394GHjA0026 = A00(C9421GIk.DEFAULT_INSTANCE);
                            C9421GIk.PARSER = interfaceC9394GHjA0026;
                        }
                    }
                    return interfaceC9394GHjA0026;
            }
        }
        if (this instanceof GJL) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GJL.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
                case 3:
                    return new GJL();
                case 4:
                    return new GJM();
                case 5:
                    return GJL.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GJL> interfaceC9394GHj16 = GJL.PARSER;
                    if (interfaceC9394GHj16 != null) {
                        return interfaceC9394GHj16;
                    }
                    synchronized (GJL.class) {
                        interfaceC9394GHjA0025 = GJL.PARSER;
                        if (interfaceC9394GHjA0025 == null) {
                            HzL hzL16 = C9391GHg.A01;
                            interfaceC9394GHjA0025 = A00(GJL.DEFAULT_INSTANCE);
                            GJL.PARSER = interfaceC9394GHjA0025;
                        }
                    }
                    return interfaceC9394GHjA0025;
            }
        }
        if (this instanceof GJN) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GJN.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
                case 3:
                    return new GJN();
                case 4:
                    return new GJP();
                case 5:
                    return GJN.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GJN> interfaceC9394GHj17 = GJN.PARSER;
                    if (interfaceC9394GHj17 != null) {
                        return interfaceC9394GHj17;
                    }
                    synchronized (GJN.class) {
                        interfaceC9394GHjA0024 = GJN.PARSER;
                        if (interfaceC9394GHjA0024 == null) {
                            HzL hzL17 = C9391GHg.A01;
                            interfaceC9394GHjA0024 = A00(GJN.DEFAULT_INSTANCE);
                            GJN.PARSER = interfaceC9394GHjA0024;
                        }
                    }
                    return interfaceC9394GHjA0024;
            }
        }
        if (this instanceof GKJ) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GKJ.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
                case 3:
                    return new GKJ();
                case 4:
                    return new GKL();
                case 5:
                    return GKJ.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GKJ> interfaceC9394GHj18 = GKJ.PARSER;
                    if (interfaceC9394GHj18 != null) {
                        return interfaceC9394GHj18;
                    }
                    synchronized (GKJ.class) {
                        interfaceC9394GHjA0023 = GKJ.PARSER;
                        if (interfaceC9394GHjA0023 == null) {
                            HzL hzL18 = C9391GHg.A01;
                            interfaceC9394GHjA0023 = A00(GKJ.DEFAULT_INSTANCE);
                            GKJ.PARSER = interfaceC9394GHjA0023;
                        }
                    }
                    return interfaceC9394GHjA0023;
            }
        }
        if (this instanceof GKG) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GKG.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u000b\u0003\u000b", new Object[]{"bitField0_", "params_", "keySize_", "version_"});
                case 3:
                    return new GKG();
                case 4:
                    return new GKO();
                case 5:
                    return GKG.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GKG> interfaceC9394GHj19 = GKG.PARSER;
                    if (interfaceC9394GHj19 != null) {
                        return interfaceC9394GHj19;
                    }
                    synchronized (GKG.class) {
                        interfaceC9394GHjA0022 = GKG.PARSER;
                        if (interfaceC9394GHjA0022 == null) {
                            HzL hzL19 = C9391GHg.A01;
                            interfaceC9394GHjA0022 = A00(GKG.DEFAULT_INSTANCE);
                            GKG.PARSER = interfaceC9394GHjA0022;
                        }
                    }
                    return interfaceC9394GHjA0022;
            }
        }
        if (this instanceof GKE) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GKE.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
                case 3:
                    return new GKE();
                case 4:
                    return new GKF();
                case 5:
                    return GKE.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GKE> interfaceC9394GHj20 = GKE.PARSER;
                    if (interfaceC9394GHj20 != null) {
                        return interfaceC9394GHj20;
                    }
                    synchronized (GKE.class) {
                        interfaceC9394GHjA0021 = GKE.PARSER;
                        if (interfaceC9394GHjA0021 == null) {
                            HzL hzL20 = C9391GHg.A01;
                            interfaceC9394GHjA0021 = A00(GKE.DEFAULT_INSTANCE);
                            GKE.PARSER = interfaceC9394GHjA0021;
                        }
                    }
                    return interfaceC9394GHjA0021;
            }
        }
        if (this instanceof GJ1) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GJ1.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\u1009\u0000", new Object[]{"bitField0_", "encryptedKeyset_", "keysetInfo_"});
                case 3:
                    return new GJ1();
                case 4:
                    return new GJ2();
                case 5:
                    return GJ1.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GJ1> interfaceC9394GHj21 = GJ1.PARSER;
                    if (interfaceC9394GHj21 != null) {
                        return interfaceC9394GHj21;
                    }
                    synchronized (GJ1.class) {
                        interfaceC9394GHjA0020 = GJ1.PARSER;
                        if (interfaceC9394GHjA0020 == null) {
                            HzL hzL21 = C9391GHg.A01;
                            interfaceC9394GHjA0020 = A00(GJ1.DEFAULT_INSTANCE);
                            GJ1.PARSER = interfaceC9394GHjA0020;
                        }
                    }
                    return interfaceC9394GHjA0020;
            }
        }
        if (this instanceof C9428GIs) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(C9428GIs.DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 3:
                    return new C9428GIs();
                case 4:
                    return new C9429GIt();
                case 5:
                    return C9428GIs.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<C9428GIs> interfaceC9394GHj22 = C9428GIs.PARSER;
                    if (interfaceC9394GHj22 != null) {
                        return interfaceC9394GHj22;
                    }
                    synchronized (C9428GIs.class) {
                        interfaceC9394GHjA0019 = C9428GIs.PARSER;
                        if (interfaceC9394GHjA0019 == null) {
                            HzL hzL22 = C9391GHg.A01;
                            interfaceC9394GHjA0019 = A00(C9428GIs.DEFAULT_INSTANCE);
                            C9428GIs.PARSER = interfaceC9394GHjA0019;
                        }
                    }
                    return interfaceC9394GHjA0019;
            }
        }
        if (this instanceof GK0) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GK0.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
                case 3:
                    return new GK0();
                case 4:
                    return new GK1();
                case 5:
                    return GK0.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GK0> interfaceC9394GHj23 = GK0.PARSER;
                    if (interfaceC9394GHj23 != null) {
                        return interfaceC9394GHj23;
                    }
                    synchronized (GK0.class) {
                        interfaceC9394GHjA0018 = GK0.PARSER;
                        if (interfaceC9394GHjA0018 == null) {
                            HzL hzL23 = C9391GHg.A01;
                            interfaceC9394GHjA0018 = A00(GK0.DEFAULT_INSTANCE);
                            GK0.PARSER = interfaceC9394GHjA0018;
                        }
                    }
                    return interfaceC9394GHjA0018;
            }
        }
        if (this instanceof C9448GJq) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(C9448GJq.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"keySize_", "version_"});
                case 3:
                    return new C9448GJq();
                case 4:
                    return new C9449GJr();
                case 5:
                    return C9448GJq.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<C9448GJq> interfaceC9394GHj24 = C9448GJq.PARSER;
                    if (interfaceC9394GHj24 != null) {
                        return interfaceC9394GHj24;
                    }
                    synchronized (C9448GJq.class) {
                        interfaceC9394GHjA0017 = C9448GJq.PARSER;
                        if (interfaceC9394GHjA0017 == null) {
                            HzL hzL24 = C9391GHg.A01;
                            interfaceC9394GHjA0017 = A00(C9448GJq.DEFAULT_INSTANCE);
                            C9448GJq.PARSER = interfaceC9394GHjA0017;
                        }
                    }
                    return interfaceC9394GHjA0017;
            }
        }
        if (this instanceof C9456GJy) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(C9456GJy.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
                case 3:
                    return new C9456GJy();
                case 4:
                    return new C9457GJz();
                case 5:
                    return C9456GJy.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<C9456GJy> interfaceC9394GHj25 = C9456GJy.PARSER;
                    if (interfaceC9394GHj25 != null) {
                        return interfaceC9394GHj25;
                    }
                    synchronized (C9456GJy.class) {
                        interfaceC9394GHjA0016 = C9456GJy.PARSER;
                        if (interfaceC9394GHjA0016 == null) {
                            HzL hzL25 = C9391GHg.A01;
                            interfaceC9394GHjA0016 = A00(C9456GJy.DEFAULT_INSTANCE);
                            C9456GJy.PARSER = interfaceC9394GHjA0016;
                        }
                    }
                    return interfaceC9394GHjA0016;
            }
        }
        if (this instanceof C9446GJo) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(C9446GJo.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"version_", "keySize_"});
                case 3:
                    return new C9446GJo();
                case 4:
                    return new C9447GJp();
                case 5:
                    return C9446GJo.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<C9446GJo> interfaceC9394GHj26 = C9446GJo.PARSER;
                    if (interfaceC9394GHj26 != null) {
                        return interfaceC9394GHj26;
                    }
                    synchronized (C9446GJo.class) {
                        interfaceC9394GHjA0015 = C9446GJo.PARSER;
                        if (interfaceC9394GHjA0015 == null) {
                            HzL hzL26 = C9391GHg.A01;
                            interfaceC9394GHjA0015 = A00(C9446GJo.DEFAULT_INSTANCE);
                            C9446GJo.PARSER = interfaceC9394GHjA0015;
                        }
                    }
                    return interfaceC9394GHjA0015;
            }
        }
        if (this instanceof GK4) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GK4.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
                case 3:
                    return new GK4();
                case 4:
                    return new GK5();
                case 5:
                    return GK4.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GK4> interfaceC9394GHj27 = GK4.PARSER;
                    if (interfaceC9394GHj27 != null) {
                        return interfaceC9394GHj27;
                    }
                    synchronized (GK4.class) {
                        interfaceC9394GHjA0014 = GK4.PARSER;
                        if (interfaceC9394GHjA0014 == null) {
                            HzL hzL27 = C9391GHg.A01;
                            interfaceC9394GHjA0014 = A00(GK4.DEFAULT_INSTANCE);
                            GK4.PARSER = interfaceC9394GHjA0014;
                        }
                    }
                    return interfaceC9394GHjA0014;
            }
        }
        if (this instanceof C9444GJm) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(C9444GJm.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
                case 3:
                    return new C9444GJm();
                case 4:
                    return new C9445GJn();
                case 5:
                    return C9444GJm.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<C9444GJm> interfaceC9394GHj28 = C9444GJm.PARSER;
                    if (interfaceC9394GHj28 != null) {
                        return interfaceC9394GHj28;
                    }
                    synchronized (C9444GJm.class) {
                        interfaceC9394GHjA0013 = C9444GJm.PARSER;
                        if (interfaceC9394GHjA0013 == null) {
                            HzL hzL28 = C9391GHg.A01;
                            interfaceC9394GHjA0013 = A00(C9444GJm.DEFAULT_INSTANCE);
                            C9444GJm.PARSER = interfaceC9394GHjA0013;
                        }
                    }
                    return interfaceC9394GHjA0013;
            }
        }
        if (this instanceof GK2) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GK2.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
                case 3:
                    return new GK2();
                case 4:
                    return new GK3();
                case 5:
                    return GK2.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GK2> interfaceC9394GHj29 = GK2.PARSER;
                    if (interfaceC9394GHj29 != null) {
                        return interfaceC9394GHj29;
                    }
                    synchronized (GK2.class) {
                        interfaceC9394GHjA0012 = GK2.PARSER;
                        if (interfaceC9394GHjA0012 == null) {
                            HzL hzL29 = C9391GHg.A01;
                            interfaceC9394GHjA0012 = A00(GK2.DEFAULT_INSTANCE);
                            GK2.PARSER = interfaceC9394GHjA0012;
                        }
                    }
                    return interfaceC9394GHjA0012;
            }
        }
        if (this instanceof GJY) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GJY.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
                case 3:
                    return new GJY();
                case 4:
                    return new GJZ();
                case 5:
                    return GJY.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GJY> interfaceC9394GHj30 = GJY.PARSER;
                    if (interfaceC9394GHj30 != null) {
                        return interfaceC9394GHj30;
                    }
                    synchronized (GJY.class) {
                        interfaceC9394GHjA0011 = GJY.PARSER;
                        if (interfaceC9394GHjA0011 == null) {
                            HzL hzL30 = C9391GHg.A01;
                            interfaceC9394GHjA0011 = A00(GJY.DEFAULT_INSTANCE);
                            GJY.PARSER = interfaceC9394GHjA0011;
                        }
                    }
                    return interfaceC9394GHjA0011;
            }
        }
        if (this instanceof C9452GJu) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(C9452GJu.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
                case 3:
                    return new C9452GJu();
                case 4:
                    return new C9453GJv();
                case 5:
                    return C9452GJu.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<C9452GJu> interfaceC9394GHj31 = C9452GJu.PARSER;
                    if (interfaceC9394GHj31 != null) {
                        return interfaceC9394GHj31;
                    }
                    synchronized (C9452GJu.class) {
                        interfaceC9394GHjA0010 = C9452GJu.PARSER;
                        if (interfaceC9394GHjA0010 == null) {
                            HzL hzL31 = C9391GHg.A01;
                            interfaceC9394GHjA0010 = A00(C9452GJu.DEFAULT_INSTANCE);
                            C9452GJu.PARSER = interfaceC9394GHjA0010;
                        }
                    }
                    return interfaceC9394GHjA0010;
            }
        }
        if (this instanceof GKC) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GKC.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
                case 3:
                    return new GKC();
                case 4:
                    return new GKD();
                case 5:
                    return GKC.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GKC> interfaceC9394GHj32 = GKC.PARSER;
                    if (interfaceC9394GHj32 != null) {
                        return interfaceC9394GHj32;
                    }
                    synchronized (GKC.class) {
                        interfaceC9394GHjA009 = GKC.PARSER;
                        if (interfaceC9394GHjA009 == null) {
                            HzL hzL32 = C9391GHg.A01;
                            interfaceC9394GHjA009 = A00(GKC.DEFAULT_INSTANCE);
                            GKC.PARSER = interfaceC9394GHjA009;
                        }
                    }
                    return interfaceC9394GHjA009;
            }
        }
        if (this instanceof C9436GJa) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(C9436GJa.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
                case 3:
                    return new C9436GJa();
                case 4:
                    return new C9437GJb();
                case 5:
                    return C9436GJa.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<C9436GJa> interfaceC9394GHj33 = C9436GJa.PARSER;
                    if (interfaceC9394GHj33 != null) {
                        return interfaceC9394GHj33;
                    }
                    synchronized (C9436GJa.class) {
                        interfaceC9394GHjA008 = C9436GJa.PARSER;
                        if (interfaceC9394GHjA008 == null) {
                            HzL hzL33 = C9391GHg.A01;
                            interfaceC9394GHjA008 = A00(C9436GJa.DEFAULT_INSTANCE);
                            C9436GJa.PARSER = interfaceC9394GHjA008;
                        }
                    }
                    return interfaceC9394GHjA008;
            }
        }
        if (this instanceof C9450GJs) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(C9450GJs.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
                case 3:
                    return new C9450GJs();
                case 4:
                    return new C9451GJt();
                case 5:
                    return C9450GJs.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<C9450GJs> interfaceC9394GHj34 = C9450GJs.PARSER;
                    if (interfaceC9394GHj34 != null) {
                        return interfaceC9394GHj34;
                    }
                    synchronized (C9450GJs.class) {
                        interfaceC9394GHjA007 = C9450GJs.PARSER;
                        if (interfaceC9394GHjA007 == null) {
                            HzL hzL34 = C9391GHg.A01;
                            interfaceC9394GHjA007 = A00(C9450GJs.DEFAULT_INSTANCE);
                            C9450GJs.PARSER = interfaceC9394GHjA007;
                        }
                    }
                    return interfaceC9394GHjA007;
            }
        }
        if (this instanceof GKA) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GKA.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
                case 3:
                    return new GKA();
                case 4:
                    return new GKB();
                case 5:
                    return GKA.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GKA> interfaceC9394GHj35 = GKA.PARSER;
                    if (interfaceC9394GHj35 != null) {
                        return interfaceC9394GHj35;
                    }
                    synchronized (GKA.class) {
                        interfaceC9394GHjA006 = GKA.PARSER;
                        if (interfaceC9394GHjA006 == null) {
                            HzL hzL35 = C9391GHg.A01;
                            interfaceC9394GHjA006 = A00(GKA.DEFAULT_INSTANCE);
                            GKA.PARSER = interfaceC9394GHjA006;
                        }
                    }
                    return interfaceC9394GHjA006;
            }
        }
        if (this instanceof GKI) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GKI.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[]{"bitField0_", "aesCtrKeyFormat_", "hmacKeyFormat_"});
                case 3:
                    return new GKI();
                case 4:
                    return new GKN();
                case 5:
                    return GKI.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GKI> interfaceC9394GHj36 = GKI.PARSER;
                    if (interfaceC9394GHj36 != null) {
                        return interfaceC9394GHj36;
                    }
                    synchronized (GKI.class) {
                        interfaceC9394GHjA005 = GKI.PARSER;
                        if (interfaceC9394GHjA005 == null) {
                            HzL hzL36 = C9391GHg.A01;
                            interfaceC9394GHjA005 = A00(GKI.DEFAULT_INSTANCE);
                            GKI.PARSER = interfaceC9394GHjA005;
                        }
                    }
                    return interfaceC9394GHjA005;
            }
        }
        if (this instanceof GKH) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GKH.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000\u0003\u1009\u0001", new Object[]{"bitField0_", "version_", "aesCtrKey_", "hmacKey_"});
                case 3:
                    return new GKH();
                case 4:
                    return new GKM();
                case 5:
                    return GKH.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GKH> interfaceC9394GHj37 = GKH.PARSER;
                    if (interfaceC9394GHj37 != null) {
                        return interfaceC9394GHj37;
                    }
                    synchronized (GKH.class) {
                        interfaceC9394GHjA004 = GKH.PARSER;
                        if (interfaceC9394GHjA004 == null) {
                            HzL hzL37 = C9391GHg.A01;
                            interfaceC9394GHjA004 = A00(GKH.DEFAULT_INSTANCE);
                            GKH.PARSER = interfaceC9394GHjA004;
                        }
                    }
                    return interfaceC9394GHjA004;
            }
        }
        if (this instanceof C9438GJc) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(C9438GJc.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
                case 3:
                    return new C9438GJc();
                case 4:
                    return new C9439GJd();
                case 5:
                    return C9438GJc.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<C9438GJc> interfaceC9394GHj38 = C9438GJc.PARSER;
                    if (interfaceC9394GHj38 != null) {
                        return interfaceC9394GHj38;
                    }
                    synchronized (C9438GJc.class) {
                        interfaceC9394GHjA003 = C9438GJc.PARSER;
                        if (interfaceC9394GHjA003 == null) {
                            HzL hzL38 = C9391GHg.A01;
                            interfaceC9394GHjA003 = A00(C9438GJc.DEFAULT_INSTANCE);
                            C9438GJc.PARSER = interfaceC9394GHjA003;
                        }
                    }
                    return interfaceC9394GHjA003;
            }
        }
        boolean z = this instanceof GJk;
        int iIntValue = num.intValue();
        if (z) {
            switch (iIntValue) {
                case 0:
                    return (byte) 1;
                case 1:
                default:
                    throw null;
                case 2:
                    return A04(GJk.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000", new Object[]{"bitField0_", "keySize_", "params_"});
                case 3:
                    return new GJk();
                case 4:
                    return new C9443GJl();
                case 5:
                    return GJk.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC9394GHj<GJk> interfaceC9394GHj39 = GJk.PARSER;
                    if (interfaceC9394GHj39 != null) {
                        return interfaceC9394GHj39;
                    }
                    synchronized (GJk.class) {
                        interfaceC9394GHjA002 = GJk.PARSER;
                        if (interfaceC9394GHjA002 == null) {
                            HzL hzL39 = C9391GHg.A01;
                            interfaceC9394GHjA002 = A00(GJk.DEFAULT_INSTANCE);
                            GJk.PARSER = interfaceC9394GHjA002;
                        }
                    }
                    return interfaceC9394GHjA002;
            }
        }
        switch (iIntValue) {
            case 0:
                return (byte) 1;
            case 1:
            default:
                throw null;
            case 2:
                return A04(C9454GJw.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\u1009\u0000", new Object[]{"bitField0_", "version_", "keyValue_", "params_"});
            case 3:
                return new C9454GJw();
            case 4:
                return new C9455GJx();
            case 5:
                return C9454GJw.DEFAULT_INSTANCE;
            case 6:
                InterfaceC9394GHj<C9454GJw> interfaceC9394GHj40 = C9454GJw.PARSER;
                if (interfaceC9394GHj40 != null) {
                    return interfaceC9394GHj40;
                }
                synchronized (C9454GJw.class) {
                    interfaceC9394GHjA00 = C9454GJw.PARSER;
                    if (interfaceC9394GHjA00 == null) {
                        HzL hzL40 = C9391GHg.A01;
                        interfaceC9394GHjA00 = A00(C9454GJw.DEFAULT_INSTANCE);
                        C9454GJw.PARSER = interfaceC9394GHjA00;
                    }
                }
                return interfaceC9394GHjA00;
        }
    }

    public final boolean equals(Object other) {
        Class<?> cls;
        if (this == other) {
            return true;
        }
        if (other == null || (cls = getClass()) != other.getClass()) {
            return false;
        }
        return GHP.A02.A00(cls).AAo(this, other);
    }

    public final int hashCode() {
        if ((this.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            return AbstractC7609F5w.A0d(this).ANL(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iANL = AbstractC7609F5w.A0d(this).ANL(this);
        this.memoizedHashCode = iANL;
        return iANL;
    }

    public static Object A05(Object method, Method object, Object... params) throws Throwable {
        try {
            return object.invoke(method, params);
        } catch (IllegalAccessException e) {
            throw BV4.A0d("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw BV4.A0d("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC9328GEj.A00;
        StringBuilder sbA13 = AbstractC7610F5x.A13(string);
        AbstractC9328GEj.A00(this, sbA13, 0);
        return sbA13.toString();
    }
}
