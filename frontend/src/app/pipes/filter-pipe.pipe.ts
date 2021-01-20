import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filterPipe'
})
export class FilterPipePipe implements PipeTransform {

  transform(value: any, input: any): any {
    if (input) {
    return 0 <= value.filter((val: string | any[]) => val.indexOf(input));
      } else {
        return value;
    }
  }
}
