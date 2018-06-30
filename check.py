results=[{},{},{}]

fruit='No object detected'
if len(results)<0:
    return fruit
else:
    confidence_list=[  result['confidence'] for result in results ]
    index=confidence_list.index(max(confidence_list))
    return result[index]['label']
