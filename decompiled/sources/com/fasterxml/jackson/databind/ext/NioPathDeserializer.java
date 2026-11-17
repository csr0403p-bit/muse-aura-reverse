package com.fasterxml.jackson.databind.ext;

import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.AnonymousClass005;
import X.C10651I0v;
import X.C60O;
import X.EnumC9834GiY;
import X.F60;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

/* loaded from: classes6.dex */
public class NioPathDeserializer extends StdScalarDeserializer<Path> {
    public static final Collection<String> A00 = Collections.singletonList("file");
    public static final boolean A01;
    public static final long serialVersionUID = 1;
    public final Collection<String> _allowedSchemes;

    static {
        File[] fileArrListRoots = File.listRoots();
        int length = fileArrListRoots.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String path = fileArrListRoots[i].getPath();
            if (path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':') {
                z = true;
                break;
            }
            i++;
        }
        A01 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NioPathDeserializer() {
        super(Path.class);
        Collection<String> collection = A00;
        if (collection == null) {
            throw C60O.A0i("Argument `allowedSchemes` must not be null");
        }
        this._allowedSchemes = collection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Path A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws Throwable {
        if (!abstractC9916Gl7.A22(EnumC9834GiY.VALUE_STRING)) {
            abstractC9904Gkk.A0X(abstractC9916Gl7, Path.class);
            throw F60.createAndThrow();
        }
        String strA1c = abstractC9916Gl7.A1c();
        if (strA1c.indexOf(58) < 0 || (A01 && strA1c.length() >= 2 && Character.isLetter(strA1c.charAt(0)) && strA1c.charAt(1) == ':')) {
            return Paths.get(strA1c, new String[0]);
        }
        try {
            URI uri = new URI(strA1c);
            String scheme = uri.getScheme();
            if (scheme != null) {
                boolean z = true;
                if (!this._allowedSchemes.contains(scheme)) {
                    Iterator<String> it = this._allowedSchemes.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        if (scheme.equalsIgnoreCase(AnonymousClass005.A0j(it))) {
                            break;
                        }
                    }
                }
                if (!z) {
                    abstractC9904Gkk.A0k(Path.class, strA1c, "scheme '%s' not allowed for Path deserialization (allowed: %s)", scheme, this._allowedSchemes.stream().map(new C10651I0v(1)).collect(Collectors.joining(", ", "[", "]")));
                    throw F60.createAndThrow();
                }
            }
            try {
                return Paths.get(uri);
            } catch (FileSystemNotFoundException e) {
                try {
                    Iterator it2 = ServiceLoader.load(FileSystemProvider.class).iterator();
                    while (it2.hasNext()) {
                        FileSystemProvider fileSystemProvider = (FileSystemProvider) it2.next();
                        if (fileSystemProvider.getScheme().equalsIgnoreCase(scheme)) {
                            return fileSystemProvider.getPath(uri);
                        }
                    }
                    abstractC9904Gkk.A0m(e, A0h());
                    throw F60.createAndThrow();
                } catch (ServiceConfigurationError e2) {
                    e = e2;
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e);
                    abstractC9904Gkk.A0m(e, A0h());
                    throw F60.createAndThrow();
                }
            }
        } catch (URISyntaxException | Exception e3) {
            e = e3;
        }
    }
}
