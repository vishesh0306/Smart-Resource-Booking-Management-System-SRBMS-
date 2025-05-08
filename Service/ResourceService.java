package Service;

import java.util.Iterator;

import DataBase.DatabaseClass;
import EntityPackage.Resource;

public class ResourceService {
	public static Resource getResource(int no) {
		Iterator<Resource>i=DatabaseClass.Rooms.iterator();
		while(i.hasNext()) {
			Resource r=i.next();
			if(r.no==no) {
				return r;
			}
		}
		return null;
	}
}
