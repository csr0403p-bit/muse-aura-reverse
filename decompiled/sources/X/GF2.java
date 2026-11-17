package X;

import X.GF2;
import X.GF3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class GF2<MessageType extends GF2<MessageType, BuilderType>, BuilderType extends GF3<MessageType, BuilderType>> extends GF5<MessageType, BuilderType> {
    public static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    public static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    public static final int UNINITIALIZED_HASH_CODE = 0;
    public static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    public static Map<Object, GF2<?, ?>> defaultInstanceMap = C60O.A1C();
    public int memoizedSerializedSize = -1;
    public GFI unknownFields = GFI.A05;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r1 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T extends X.GF2<T, ?>> T A00(T r8, byte[] r9) throws java.lang.Throwable {
        /*
            r7 = r9
            r6 = r8
            int r9 = r9.length
            X.HwP r1 = X.HwP.A00()
            r8 = 0
            if (r9 != 0) goto L2d
            if (r6 == 0) goto L2c
        Lc:
            java.lang.Integer r0 = X.C79.A00
            java.lang.Object r0 = r6.A06(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            byte r1 = r0.byteValue()
            r0 = 1
            if (r1 == r0) goto L2c
            if (r1 == 0) goto L46
            X.GF4 r0 = X.AbstractC7609F5w.A0X(r6)
            boolean r1 = r0.AOY(r6)
            java.lang.Integer r0 = X.C79.A01
            r6.A06(r0)
            if (r1 == 0) goto L46
        L2c:
            return r6
        L2d:
            java.lang.Integer r0 = X.C79.A0K
            r3 = 0
            java.lang.Object r6 = r6.A06(r0)
            X.GF2 r6 = (X.GF2) r6
            X.GF4 r4 = X.AbstractC7609F5w.A0X(r6)     // Catch: java.io.IOException -> L54 androidx.health.platform.client.proto.UninitializedMessageException -> L6e androidx.health.platform.client.proto.InvalidProtocolBufferException -> L7b java.lang.IndexOutOfBoundsException -> L8d
            X.GF6 r5 = new X.GF6     // Catch: java.io.IOException -> L54 androidx.health.platform.client.proto.UninitializedMessageException -> L6e androidx.health.platform.client.proto.InvalidProtocolBufferException -> L7b java.lang.IndexOutOfBoundsException -> L8d
            r5.<init>(r1)     // Catch: java.io.IOException -> L54 androidx.health.platform.client.proto.UninitializedMessageException -> L6e androidx.health.platform.client.proto.InvalidProtocolBufferException -> L7b java.lang.IndexOutOfBoundsException -> L8d
            r4.AQf(r5, r6, r7, r8, r9)     // Catch: java.io.IOException -> L54 androidx.health.platform.client.proto.UninitializedMessageException -> L6e androidx.health.platform.client.proto.InvalidProtocolBufferException -> L7b java.lang.IndexOutOfBoundsException -> L8d
            r4.AQ3(r6)     // Catch: java.io.IOException -> L54 androidx.health.platform.client.proto.UninitializedMessageException -> L6e androidx.health.platform.client.proto.InvalidProtocolBufferException -> L7b java.lang.IndexOutOfBoundsException -> L8d
            goto Lc
        L46:
            androidx.health.platform.client.proto.UninitializedMessageException r0 = new androidx.health.platform.client.proto.UninitializedMessageException
            r0.<init>()
            java.lang.String r0 = r0.getMessage()
            androidx.health.platform.client.proto.InvalidProtocolBufferException r2 = X.AbstractC7609F5w.A0W(r0)
            goto L96
        L54:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof androidx.health.platform.client.proto.InvalidProtocolBufferException
            if (r0 == 0) goto L62
            java.lang.Throwable r2 = r1.getCause()
            throw r2
        L62:
            java.lang.String r0 = r1.getMessage()
            androidx.health.platform.client.proto.InvalidProtocolBufferException r2 = new androidx.health.platform.client.proto.InvalidProtocolBufferException
            r2.<init>(r0, r1)
            r2.unfinishedMessage = r3
            goto L96
        L6e:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            androidx.health.platform.client.proto.InvalidProtocolBufferException r2 = new androidx.health.platform.client.proto.InvalidProtocolBufferException
            r2.<init>(r0)
            r2.unfinishedMessage = r3
            goto L96
        L7b:
            r2 = move-exception
            boolean r0 = r2.wasThrownFromInputStream
            if (r0 == 0) goto L96
            java.lang.String r1 = r2.getMessage()
            androidx.health.platform.client.proto.InvalidProtocolBufferException r0 = new androidx.health.platform.client.proto.InvalidProtocolBufferException
            r0.<init>(r1, r2)
            r0.unfinishedMessage = r3
            r2 = r0
            goto L96
        L8d:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            androidx.health.platform.client.proto.InvalidProtocolBufferException r2 = new androidx.health.platform.client.proto.InvalidProtocolBufferException
            r2.<init>(r0)
            r2.unfinishedMessage = r3
        L96:
            r2.unfinishedMessage = r6
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GF2.A00(X.GF2, byte[]):X.GF2");
    }

    /* JADX WARN: Incorrect types in method signature: <T:LX/GF2<**>;>(Ljava/lang/Class<TT;>;TT;)V */
    public static void A02(GF2 clazz, Class defaultInstance) {
        clazz.memoizedSerializedSize &= Integer.MAX_VALUE;
        defaultInstanceMap.put(defaultInstance, clazz);
    }

    public final <MessageType extends GF2<MessageType, BuilderType>, BuilderType extends GF3<MessageType, BuilderType>> BuilderType A05() {
        return (BuilderType) A06(C79.A0P);
    }

    public final Object A06(Integer num) {
        G0P g0k;
        G0P g0k2;
        G0P g0k3;
        G0P g0k4;
        G0P g0k5;
        G0P g0k6;
        G0P g0k7;
        G0P g0k8;
        G0P g0k9;
        G0P g0k10;
        G0P g0k11;
        G0P g0k12;
        G0P g0k13;
        G0P g0k14;
        G0P g0k15;
        G0P g0k16;
        G0P g0k17;
        G0P g0k18;
        G0P g0k19;
        G0P g0k20;
        G0P g0k21;
        G0P g0k22;
        G0P g0k23;
        G0P g0k24;
        if (this instanceof C9174Fzh) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9174Fzh.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1008\u0002\u0004\u1008\u0003", new Object[]{"bitField0_", "startTimeEpochMs_", "endTimeEpochMs_", "startLocalDateTime_", "endLocalDateTime_"});
                case 3:
                    return new C9174Fzh();
                case 4:
                    return new C9158FzR();
                case 5:
                    return C9174Fzh.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9174Fzh> g0p = C9174Fzh.PARSER;
                    if (g0p != null) {
                        return g0p;
                    }
                    synchronized (C9174Fzh.class) {
                        g0k24 = C9174Fzh.PARSER;
                        if (g0k24 == null) {
                            HwP hwP = G0K.A01;
                            g0k24 = new G0K(C9174Fzh.DEFAULT_INSTANCE);
                            C9174Fzh.PARSER = g0k24;
                        }
                    }
                    return g0k24;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9177Fzk) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9177Fzk.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000", new Object[]{"bitField0_", "dataPoint_", C9168Fzb.class, "pageToken_"});
                case 3:
                    return new C9177Fzk();
                case 4:
                    return new G0A();
                case 5:
                    return C9177Fzk.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9177Fzk> g0p2 = C9177Fzk.PARSER;
                    if (g0p2 != null) {
                        return g0p2;
                    }
                    synchronized (C9177Fzk.class) {
                        g0k23 = C9177Fzk.PARSER;
                        if (g0k23 == null) {
                            HwP hwP2 = G0K.A01;
                            g0k23 = new G0K(C9177Fzk.DEFAULT_INSTANCE);
                            C9177Fzk.PARSER = g0k23;
                        }
                    }
                    return g0k23;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9189Fzw) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9189Fzw.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[]{"bitField0_", "changesToken_"});
                case 3:
                    return new C9189Fzw();
                case 4:
                    return new G09();
                case 5:
                    return C9189Fzw.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9189Fzw> g0p3 = C9189Fzw.PARSER;
                    if (g0p3 != null) {
                        return g0p3;
                    }
                    synchronized (C9189Fzw.class) {
                        g0k22 = C9189Fzw.PARSER;
                        if (g0k22 == null) {
                            HwP hwP3 = G0K.A01;
                            g0k22 = new G0K(C9189Fzw.DEFAULT_INSTANCE);
                            C9189Fzw.PARSER = g0k22;
                        }
                    }
                    return g0k22;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9176Fzj) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9176Fzj.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\u1007\u0000\u0003\u1008\u0001\u0004\u1007\u0002", new Object[]{"bitField0_", "changes_", C9190Fzx.class, "hasMore_", "nextChangesToken_", "changesTokenExpired_"});
                case 3:
                    return new C9176Fzj();
                case 4:
                    return new G08();
                case 5:
                    return C9176Fzj.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9176Fzj> g0p4 = C9176Fzj.PARSER;
                    if (g0p4 != null) {
                        return g0p4;
                    }
                    synchronized (C9176Fzj.class) {
                        g0k21 = C9176Fzj.PARSER;
                        if (g0k21 == null) {
                            HwP hwP4 = G0K.A01;
                            g0k21 = new G0K(C9176Fzj.DEFAULT_INSTANCE);
                            C9176Fzj.PARSER = g0k21;
                        }
                    }
                    return g0k21;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9182Fzp) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9182Fzp.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rows_", C9169Fzc.class});
                case 3:
                    return new C9182Fzp();
                case 4:
                    return new G07();
                case 5:
                    return C9182Fzp.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9182Fzp> g0p5 = C9182Fzp.PARSER;
                    if (g0p5 != null) {
                        return g0p5;
                    }
                    synchronized (C9182Fzp.class) {
                        g0k20 = C9182Fzp.PARSER;
                        if (g0k20 == null) {
                            HwP hwP5 = G0K.A01;
                            g0k20 = new G0K(C9182Fzp.DEFAULT_INSTANCE);
                            C9182Fzp.PARSER = g0k20;
                        }
                    }
                    return g0k20;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof G0L) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(G0L.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1008\u0002\u0004\u1007\u0003", new Object[]{"bitField0_", "callingPackage_", "sdkVersion_", "permissionToken_", "isInForeground_"});
                case 3:
                    return new G0L();
                case 4:
                    return new G0O();
                case 5:
                    return G0L.DEFAULT_INSTANCE;
                case 6:
                    G0P<G0L> g0p6 = G0L.PARSER;
                    if (g0p6 != null) {
                        return g0p6;
                    }
                    synchronized (G0L.class) {
                        g0k19 = G0L.PARSER;
                        if (g0k19 == null) {
                            HwP hwP6 = G0K.A01;
                            g0k19 = new G0K(G0L.DEFAULT_INSTANCE);
                            G0L.PARSER = g0k19;
                        }
                    }
                    return g0k19;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9171Fze) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9171Fze.DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u001b\u0004\u1004\u0003\u0005\u1004\u0004\u0006\u1008\u0005\u0007\u1007\u0002", new Object[]{"bitField0_", "timeSpec_", "dataType_", "dataOriginFilters_", C9183Fzq.class, "limit_", "pageSize_", "pageToken_", "ascOrdering_"});
                case 3:
                    return new C9171Fze();
                case 4:
                    return new G06();
                case 5:
                    return C9171Fze.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9171Fze> g0p7 = C9171Fze.PARSER;
                    if (g0p7 != null) {
                        return g0p7;
                    }
                    synchronized (C9171Fze.class) {
                        g0k18 = C9171Fze.PARSER;
                        if (g0k18 == null) {
                            HwP hwP7 = G0K.A01;
                            g0k18 = new G0K(C9171Fze.DEFAULT_INSTANCE);
                            C9171Fze.PARSER = g0k18;
                        }
                    }
                    return g0k18;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9173Fzg) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9173Fzg.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"dataType_", C9184Fzr.class, "dataOriginFilters_", C9183Fzq.class});
                case 3:
                    return new C9173Fzg();
                case 4:
                    return new C9141FzA();
                case 5:
                    return C9173Fzg.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9173Fzg> g0p8 = C9173Fzg.PARSER;
                    if (g0p8 != null) {
                        return g0p8;
                    }
                    synchronized (C9173Fzg.class) {
                        g0k17 = C9173Fzg.PARSER;
                        if (g0k17 == null) {
                            HwP hwP8 = G0K.A01;
                            g0k17 = new G0K(C9173Fzg.DEFAULT_INSTANCE);
                            C9173Fzg.PARSER = g0k17;
                        }
                    }
                    return g0k17;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9186Fzt) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9186Fzt.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[]{"bitField0_", "changesToken_"});
                case 3:
                    return new C9186Fzt();
                case 4:
                    return new Fz9();
                case 5:
                    return C9186Fzt.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9186Fzt> g0p9 = C9186Fzt.PARSER;
                    if (g0p9 != null) {
                        return g0p9;
                    }
                    synchronized (C9186Fzt.class) {
                        g0k16 = C9186Fzt.PARSER;
                        if (g0k16 == null) {
                            HwP hwP9 = G0K.A01;
                            g0k16 = new G0K(C9186Fzt.DEFAULT_INSTANCE);
                            C9186Fzt.PARSER = g0k16;
                        }
                    }
                    return g0k16;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9178Fzl) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9178Fzl.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[]{"bitField0_", "dataTypeName_", "aggregationType_", "fieldName_"});
                case 3:
                    return new C9178Fzl();
                case 4:
                    return new C9151FzK();
                case 5:
                    return C9178Fzl.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9178Fzl> g0p10 = C9178Fzl.PARSER;
                    if (g0p10 != null) {
                        return g0p10;
                    }
                    synchronized (C9178Fzl.class) {
                        g0k15 = C9178Fzl.PARSER;
                        if (g0k15 == null) {
                            HwP hwP10 = G0K.A01;
                            g0k15 = new G0K(C9178Fzl.DEFAULT_INSTANCE);
                            C9178Fzl.PARSER = g0k15;
                        }
                    }
                    return g0k15;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9170Fzd) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9170Fzd.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u1009\u0000\u0002\u001b\u0003\u001b\u0004\u1002\u0001\u0005\u1008\u0002", new Object[]{"bitField0_", "timeSpec_", "metricSpec_", C9178Fzl.class, "dataOrigin_", C9183Fzq.class, "sliceDurationMillis_", "slicePeriod_"});
                case 3:
                    return new C9170Fzd();
                case 4:
                    return new C9089FyG();
                case 5:
                    return C9170Fzd.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9170Fzd> g0p11 = C9170Fzd.PARSER;
                    if (g0p11 != null) {
                        return g0p11;
                    }
                    synchronized (C9170Fzd.class) {
                        g0k14 = C9170Fzd.PARSER;
                        if (g0k14 == null) {
                            HwP hwP11 = G0K.A01;
                            g0k14 = new G0K(C9170Fzd.DEFAULT_INSTANCE);
                            C9170Fzd.PARSER = g0k14;
                        }
                    }
                    return g0k14;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9180Fzn) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9180Fzn.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u180c\u0001\u0003\u1008\u0002", new Object[]{"bitField0_", "dataType_", "accessType_", G0I.A00, "permission_"});
                case 3:
                    return new C9180Fzn();
                case 4:
                    return new C9150FzJ();
                case 5:
                    return C9180Fzn.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9180Fzn> g0p12 = C9180Fzn.PARSER;
                    if (g0p12 != null) {
                        return g0p12;
                    }
                    synchronized (C9180Fzn.class) {
                        g0k13 = C9180Fzn.PARSER;
                        if (g0k13 == null) {
                            HwP hwP12 = G0K.A01;
                            g0k13 = new G0K(C9180Fzn.DEFAULT_INSTANCE);
                            C9180Fzn.PARSER = g0k13;
                        }
                    }
                    return g0k13;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9185Fzs) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9185Fzs.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u001b", new Object[]{"bitField0_", "code_", "message_", "permission_", C9180Fzn.class});
                case 3:
                    return new C9185Fzs();
                case 4:
                    return new G05();
                case 5:
                    return C9185Fzs.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9185Fzs> g0p13 = C9185Fzs.PARSER;
                    if (g0p13 != null) {
                        return g0p13;
                    }
                    synchronized (C9185Fzs.class) {
                        g0k12 = C9185Fzs.PARSER;
                        if (g0k12 == null) {
                            HwP hwP13 = G0K.A01;
                            g0k12 = new G0K(C9185Fzs.DEFAULT_INSTANCE);
                            C9185Fzs.PARSER = g0k12;
                        }
                    }
                    return g0k12;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9187Fzu) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9187Fzu.DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u00015\u0000\u00023\u0000\u0003;\u0000\u0004;\u0000\u0005:\u0000", new Object[]{"value_", "valueCase_"});
                case 3:
                    return new C9187Fzu();
                case 4:
                    return new G04();
                case 5:
                    return C9187Fzu.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9187Fzu> g0p14 = C9187Fzu.PARSER;
                    if (g0p14 != null) {
                        return g0p14;
                    }
                    synchronized (C9187Fzu.class) {
                        g0k11 = C9187Fzu.PARSER;
                        if (g0k11 == null) {
                            HwP hwP14 = G0K.A01;
                            g0k11 = new G0K(C9187Fzu.DEFAULT_INSTANCE);
                            C9187Fzu.PARSER = g0k11;
                        }
                    }
                    return g0k11;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9175Fzi) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9175Fzi.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u00012\u0002\u1002\u0000\u0003\u1002\u0001", new Object[]{"bitField0_", "values_", G0G.A00, "startTimeMillis_", "endTimeMillis_"});
                case 3:
                    return new C9175Fzi();
                case 4:
                    return new G03();
                case 5:
                    return C9175Fzi.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9175Fzi> g0p15 = C9175Fzi.PARSER;
                    if (g0p15 != null) {
                        return g0p15;
                    }
                    synchronized (C9175Fzi.class) {
                        g0k10 = C9175Fzi.PARSER;
                        if (g0k10 == null) {
                            HwP hwP15 = G0K.A01;
                            g0k10 = new G0K(C9175Fzi.DEFAULT_INSTANCE);
                            C9175Fzi.PARSER = g0k10;
                        }
                    }
                    return g0k10;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9172Fzf) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9172Fzf.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002\u1002\u0000", new Object[]{"bitField0_", "values_", G0F.A00, "instantTimeMillis_"});
                case 3:
                    return new C9172Fzf();
                case 4:
                    return new C9191Fzy();
                case 5:
                    return C9172Fzf.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9172Fzf> g0p16 = C9172Fzf.PARSER;
                    if (g0p16 != null) {
                        return g0p16;
                    }
                    synchronized (C9172Fzf.class) {
                        g0k9 = C9172Fzf.PARSER;
                        if (g0k9 == null) {
                            HwP hwP16 = G0K.A01;
                            g0k9 = new G0K(C9172Fzf.DEFAULT_INSTANCE);
                            C9172Fzf.PARSER = g0k9;
                        }
                    }
                    return g0k9;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9181Fzo) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9181Fzo.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003", new Object[]{"bitField0_", "identifier_", "manufacturer_", "model_", "type_"});
                case 3:
                    return new C9181Fzo();
                case 4:
                    return new C9149FzI();
                case 5:
                    return C9181Fzo.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9181Fzo> g0p17 = C9181Fzo.PARSER;
                    if (g0p17 != null) {
                        return g0p17;
                    }
                    synchronized (C9181Fzo.class) {
                        g0k8 = C9181Fzo.PARSER;
                        if (g0k8 == null) {
                            HwP hwP17 = G0K.A01;
                            g0k8 = new G0K(C9181Fzo.DEFAULT_INSTANCE);
                            C9181Fzo.PARSER = g0k8;
                        }
                    }
                    return g0k8;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9184Fzr) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9184Fzr.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[]{"bitField0_", "name_"});
                case 3:
                    return new C9184Fzr();
                case 4:
                    return new C9159FzS();
                case 5:
                    return C9184Fzr.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9184Fzr> g0p18 = C9184Fzr.PARSER;
                    if (g0p18 != null) {
                        return g0p18;
                    }
                    synchronized (C9184Fzr.class) {
                        g0k7 = C9184Fzr.PARSER;
                        if (g0k7 == null) {
                            HwP hwP18 = G0K.A01;
                            g0k7 = new G0K(C9184Fzr.DEFAULT_INSTANCE);
                            C9184Fzr.PARSER = g0k7;
                        }
                    }
                    return g0k7;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9168Fzb) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9168Fzb.DEFAULT_INSTANCE, "\u0001\u0016\u0000\u0001\u0001\u0017\u0016\u0002\u0001\u0000\u0001\u1009\u0000\u00022\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1009\u0003\u0006\u1004\u0004\u0007\u1002\u0005\b\u1002\u0006\t\u1002\u0007\n\u1002\b\u000b\u1008\t\f\u1002\n\r\u1009\u000b\u000e\u1008\f\u000f\u001b\u0010\u1009\r\u0011\u1009\u000e\u0012\u1009\u000f\u0013\u1004\u0010\u0014\u1004\u0011\u00162\u0017\u1004\u0012", new Object[]{"bitField0_", "dataType_", "values_", G0E.A00, "uid_", "originSeriesUid_", "dataOrigin_", "zoneOffsetSeconds_", "updateTimeMillis_", "instantTimeMillis_", "startTimeMillis_", "endTimeMillis_", "clientId_", "clientVersion_", "device_", "originSampleUid_", "seriesValues_", C9172Fzf.class, "min_", "max_", "avg_", "startZoneOffsetSeconds_", "endZoneOffsetSeconds_", "subTypeDataLists_", G0B.A00, "recordingMethod_"});
                case 3:
                    return new C9168Fzb();
                case 4:
                    return new C9167Fza();
                case 5:
                    return C9168Fzb.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9168Fzb> g0p19 = C9168Fzb.PARSER;
                    if (g0p19 != null) {
                        return g0p19;
                    }
                    synchronized (C9168Fzb.class) {
                        g0k6 = C9168Fzb.PARSER;
                        if (g0k6 == null) {
                            HwP hwP19 = G0K.A01;
                            g0k6 = new G0K(C9168Fzb.DEFAULT_INSTANCE);
                            C9168Fzb.PARSER = g0k6;
                        }
                    }
                    return g0k6;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9179Fzm) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9179Fzm.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", C9175Fzi.class});
                case 3:
                    return new C9179Fzm();
                case 4:
                    return new G02();
                case 5:
                    return C9179Fzm.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9179Fzm> g0p20 = C9179Fzm.PARSER;
                    if (g0p20 != null) {
                        return g0p20;
                    }
                    synchronized (C9179Fzm.class) {
                        g0k5 = C9179Fzm.PARSER;
                        if (g0k5 == null) {
                            HwP hwP20 = G0K.A01;
                            g0k5 = new G0K(C9179Fzm.DEFAULT_INSTANCE);
                            C9179Fzm.PARSER = g0k5;
                        }
                    }
                    return g0k5;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9183Fzq) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9183Fzq.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[]{"bitField0_", "applicationId_"});
                case 3:
                    return new C9183Fzq();
                case 4:
                    return new C9107FyY();
                case 5:
                    return C9183Fzq.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9183Fzq> g0p21 = C9183Fzq.PARSER;
                    if (g0p21 != null) {
                        return g0p21;
                    }
                    synchronized (C9183Fzq.class) {
                        g0k4 = C9183Fzq.PARSER;
                        if (g0k4 == null) {
                            HwP hwP21 = G0K.A01;
                            g0k4 = new G0K(C9183Fzq.DEFAULT_INSTANCE);
                            C9183Fzq.PARSER = g0k4;
                        }
                    }
                    return g0k4;
                default:
                    throw C8j3.A17();
            }
        }
        if (this instanceof C9188Fzv) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9188Fzv.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"values_", G0D.A00});
                case 3:
                    return new C9188Fzv();
                case 4:
                    return new G01();
                case 5:
                    return C9188Fzv.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9188Fzv> g0p22 = C9188Fzv.PARSER;
                    if (g0p22 != null) {
                        return g0p22;
                    }
                    synchronized (C9188Fzv.class) {
                        g0k3 = C9188Fzv.PARSER;
                        if (g0k3 == null) {
                            HwP hwP22 = G0K.A01;
                            g0k3 = new G0K(C9188Fzv.DEFAULT_INSTANCE);
                            C9188Fzv.PARSER = g0k3;
                        }
                    }
                    return g0k3;
                default:
                    throw C8j3.A17();
            }
        }
        boolean z = this instanceof C9169Fzc;
        int iIntValue = num.intValue();
        if (z) {
            switch (iIntValue) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new GFM(C9169Fzc.DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0002\u0001\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1004\u0004\u00062\u00072\b\u001b", new Object[]{"bitField0_", "startTimeEpochMs_", "endTimeEpochMs_", "startLocalDateTime_", "endLocalDateTime_", "zoneOffsetSeconds_", "doubleValues_", G0C.A00, "longValues_", G0H.A00, "dataOrigins_", C9183Fzq.class});
                case 3:
                    return new C9169Fzc();
                case 4:
                    return new G00();
                case 5:
                    return C9169Fzc.DEFAULT_INSTANCE;
                case 6:
                    G0P<C9169Fzc> g0p23 = C9169Fzc.PARSER;
                    if (g0p23 != null) {
                        return g0p23;
                    }
                    synchronized (C9169Fzc.class) {
                        g0k2 = C9169Fzc.PARSER;
                        if (g0k2 == null) {
                            HwP hwP23 = G0K.A01;
                            g0k2 = new G0K(C9169Fzc.DEFAULT_INSTANCE);
                            C9169Fzc.PARSER = g0k2;
                        }
                    }
                    return g0k2;
                default:
                    throw C8j3.A17();
            }
        }
        switch (iIntValue) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new GFM(C9190Fzx.DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002;\u0000", new Object[]{"change_", "changeCase_", C9168Fzb.class});
            case 3:
                return new C9190Fzx();
            case 4:
                return new C9192Fzz();
            case 5:
                return C9190Fzx.DEFAULT_INSTANCE;
            case 6:
                G0P<C9190Fzx> g0p24 = C9190Fzx.PARSER;
                if (g0p24 != null) {
                    return g0p24;
                }
                synchronized (C9190Fzx.class) {
                    g0k = C9190Fzx.PARSER;
                    if (g0k == null) {
                        HwP hwP24 = G0K.A01;
                        g0k = new G0K(C9190Fzx.DEFAULT_INSTANCE);
                        C9190Fzx.PARSER = g0k;
                    }
                }
                return g0k;
            default:
                throw C8j3.A17();
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
        return GFJ.A02.A00(cls).AAo(this, other);
    }

    public final int hashCode() {
        if (AbstractC7609F5w.A1U(this.memoizedSerializedSize, Integer.MIN_VALUE)) {
            return AbstractC7609F5w.A0X(this).ANL(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iANL = AbstractC7609F5w.A0X(this).ANL(this);
        this.memoizedHashCode = iANL;
        return iANL;
    }

    public static Object A01(Object method, Method object, Object... params) throws Throwable {
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

    public final void A07() {
        AbstractC7609F5w.A0X(this).AQ3(this);
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // X.GF8
    public final void Aj0(GFE output) {
        GF4 gf4A0X = AbstractC7609F5w.A0X(this);
        GFD gfd = output.A01;
        if (gfd == null) {
            gfd = new GFD(output);
        }
        gf4A0X.Aj5(gfd, this);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC9326GEh.A00;
        StringBuilder sbA13 = AbstractC7610F5x.A13(string);
        AbstractC9326GEh.A00(this, sbA13, 0);
        return sbA13.toString();
    }
}
