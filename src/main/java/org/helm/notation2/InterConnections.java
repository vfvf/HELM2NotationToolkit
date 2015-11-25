/**
 * *****************************************************************************
 * /**
 * *****************************************************************************
 * Copyright C 2015, The Pistoia Alliance
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *****************************************************************************
 */
package org.helm.notation2;


import java.util.HashMap;
import java.util.Map;


/**
 * InterConnections
 * 
 * @author hecht
 */
public class InterConnections {


  Map<String, String> mapInterConnections = new HashMap<String, String>();

  public InterConnections(){  
  }

  public InterConnections(Map<String, String> map) {
    mapInterConnections = map;
  }
  
  
  public void addConnection(String key, String value) {
    mapInterConnections.put(key, value);
  }

  public void deleteConnection(String key) {
    if (mapInterConnections.containsKey(key)) {
      mapInterConnections.remove(key);
    }
  }

  public Map<String, String> getInterConnections() {
    return mapInterConnections;
  }

  public boolean hasKey(String key) {
    return mapInterConnections.containsKey(key);
  }



  
  
}
