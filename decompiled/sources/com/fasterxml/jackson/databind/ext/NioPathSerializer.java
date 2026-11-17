package com.fasterxml.jackson.databind.ext;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.C10091GpF;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.nio.file.Path;

/* loaded from: classes6.dex */
public class NioPathSerializer extends StdScalarSerializer<Path> {
    public static final long serialVersionUID = 1;

    public NioPathSerializer() {
        super(Path.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) {
        Path path = (Path) obj;
        C10091GpF c10091GpFA06 = JsonSerializer.A06(abstractC9919GlE, abstractC9996GnP, Path.class, path);
        abstractC9919GlE.A0s(path.toUri().toString());
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA06);
    }
}
